#include <iostream>
#include <string>
using namespace std;
int main()
{
	string x1;
	string x2;
	int a = 0;
	cin >> x1;
	while (1) {
		cin >> x2;
		a += x2.length() + 1;
		if (x1 == x2) {
			cout << a - x1.length() - 1;
			break;
		}
		if (x2 == "$") {
			cout << "-1";
			break;
		}
	}
	return 0;
}