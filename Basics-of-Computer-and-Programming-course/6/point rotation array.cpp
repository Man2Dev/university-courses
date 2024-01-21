#include <iostream>
using namespace std;
int main() {
	int x = 0, y = 0, i, j, n, k = 1, count = 1, m;
	cin >> n;
	if (n == 1) {
		cout << x << " " << y << endl;
	}
	if (n > 1) {
		do {
			++count;
			x += k;
			if (count == n) {
				cout << x << " " << y;
				break;
			}
			++count;
			y += k;
			k++;
			if (count == n) {
				cout << x << " " << y;
				break;
			}
			++count;
			x -= k;
			if (count == n) {
				cout << x << " " << y;
				break;
			}
			++count;
			y -= k;
			k++;
			if (count == n) {
				cout << x << " " << y;
				break;
			}
		} while (true);
	}
	return 0;
}