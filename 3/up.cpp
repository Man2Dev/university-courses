#include <iostream>
#include <string>
using namespace std;
int main()
{
	string s;
	int x, i = 0, U = 0, D = 0, L = 0, R = 0;
	cin >> x >> s;
	for (i = 0; i < x; i++) {
		if (s[i] == 'U') {
			U++;
		}
		if (s[i] == 'D') {
			D++;
		}
		if (s[i] == 'R') {
			R++;
		}
		if (s[i] == 'L') {
			L++;
		}
	}
	if (U >= D && L >= R)
		cout << x - ((U - D) + (L - R));
	else if (U >= D && R >= L)
		cout << x - ((U - D) + (R - L));
	else if (D >= U && R >= L)
		cout << x - ((D - U) + (R - L));
	else if (D >= U && L >= R)
		cout << x - ((D - U) + (L - R));
	return 0;
}