#include <iostream>
using namespace std;
int main()
{
	int i, j, x, y, n = 0, ans = 0, ans1 = 0, a;
	cin >> x;
	cin >> y;
	if (y >= x) {
		for (i = 2; i <= (y - x); i++) {
			a = i;
			if ((y - x) % i == 0)
				ans = i;
			if (ans == a) {
				cout << ans << " ";
			}
		}
	}
	if (y < x) {
		for (i = 2; i <= (x - y); i++) {
			a = i;
			if ((x - y) % i == 0)
				ans = i;
			if (ans == a) {
				cout << ans << " ";
			}
		}
	}
	return 0;
}