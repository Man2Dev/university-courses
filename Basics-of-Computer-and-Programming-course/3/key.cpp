#include <iostream>
#include <string>
using namespace std;
int main()
{
	string s = "qwertyuiopasdfghjkl;zxcvbnm,./";
	string y;
	string x;
	int L, R, i = 0, j = 0;
	cin >> x >> y;
	for (j = 0; j < y.length(); j++) {
		for (i = 0; i < s.length(); i++) {
			if (y[j] == s[i]) {
				if (x == "L") {
					cout << s[i + 1];
				}
				if (x == "R") {
					cout << s[i - 1];
				}
			}
		}
	}
	return 0;
}