#include <iostream>
#include <string>
using namespace std;
int main()
{
	string s;
	int times = 1; bool u = true;
	cin >> s;
	for (int i = 1; i < (s.length()); i++) {
		if (s[i] == s[i - 1]) {
			times++;
		}
		if (s[i] != s[i - 1]) {
			times = 1;
		}
		if (times == 7) {
			u = false;
			cout << "YES";
			break;
		}
	}
	if (u == true)
		cout << "NO";
	return 0;
}