#include <iostream>
using namespace std;
int main()
{
	unsigned a[20], temp[20]; int i, k, j, o; char L, R, x;
	cin >> x;
	if (x == 'R') {
		cin >> k;
		k = k % 20;
		for (i = 0; i < 20; i++)
			cin >> a[i];
		for (i = 0; i < 20; i++) {
			o = a[(i + 20 - k) % 20];
			cout << o << " ";
		}
	}
	if (x == 'L') {
		cin >> k;
		for (i = 0; i < 20; i++)
			cin >> a[i];
		for (i = 0; i < 20; i++) {
			o = a[(k + i) % 20];
			cout << o << " ";
		}
	}
	return 0;
}