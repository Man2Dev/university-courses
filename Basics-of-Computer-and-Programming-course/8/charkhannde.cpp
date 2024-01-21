#include <iostream>
using namespace std;

int main() {
	int n, k;
	char c;
	cin >> n >> c >> k;
	int *a = new int[n*n];
	int *temp = new int[n*n];
	for (int i = 0; i<n*n; i++) {
		cin >> a[i];
	}
	for (int i = 0; i<n*n; i++) {
		temp[i] = a[i];
	}
	if (c == 'L') {
		for (int i = 0; i<n*n; i++) {
			a[i] = temp[(i + k) % (n*n)];
		}
		for (int i = 0; i<n*n; i++) {
			cout << a[i] << " ";
			if ((i + 1) % n == 0) cout << endl;
		}
	}
	if (c == 'R') {
		for (int i = 0; i<n*n; i++) {
			temp[(i + k) % (n*n)] = a[i];
		}
		for (int i = 0; i<n*n; i++) {
			cout << temp[i] << " ";
			if ((i + 1) % n == 0) cout << endl;
		}
	}

	return 0;
}
