#include <iostream>
using namespace std;
int main() {
	int a[10], b[10], j, i, o = 0, e = 0, sum = 0, sum2 = 0, k, count = 0; bool s = 0, v = 0;
	cin >> k;
	for (i = 0; i < 10; i++) {
		cin >> a[i];
		cin >> b[i];
	}
	for (i = 0; i < 10; i++) {
		o = a[(k + i) % 10];
		sum += o; //gas
		e = b[(k + i) % 10];
		sum2 += e; //distance
		if (sum >= sum2) { //if you have more gas than distance
			count += 1;
			if (count == 10) {
				v = 1; //if you get 10*(yes)
				break;
			}
		}
		if (sum < sum2) { //if you have less gas than distance
			s = 1;
			break;
		}
	}
	if (v == 1) {
		cout << "YES";
	}
	if (v == 0 || s == 1) {
		cout << "NO";
	}
	return 0;
}