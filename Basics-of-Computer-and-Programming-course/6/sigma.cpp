#include <iostream>
using namespace std;
int main() {
	int x, y, s = 0, i, j, q, v, p, ans = 0, sum = 0;
	cin >> y;
	cin >> x;
	for (i = -10; i <= x; i++) {
		for (j = 1; j <= y; j++) {
			p = i + j;
			ans = p * p * p / (j*j);
			sum += ans;
		}
	}
	cout << sum;
	return 0;
}