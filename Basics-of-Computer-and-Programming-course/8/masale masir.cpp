#include <iostream>
using namespace std;

int faktoriel(int x);
int main() {

	int i, j, i_A = 0, j_A = 0, i_B = 0, j_B = 0, n, m, U = 0, R = 0, res = 0;
	cin >> n >> m;
	char** a;
	a = new char*[n];
	for (i = 0; i<n; i++) {
		a[i] = new char[m];
		for (j = 0; j<m; j++) {
			cin >> a[i][j];
		}
	}

	for (i = 0; i<n; i++) {
		for (j = 0; j<m; j++) {
			if (a[i][j] == 'A') {
				i_A = i;
				j_A = j;
			}
			if (a[i][j] == 'B') {
				i_B = i;
				j_B = j;
			}
		}
	}
	if ((i_A - i_B) >= 0 && (j_B - j_A) >= 0) {
		U = i_A - i_B;
		R = j_B - j_A;
		res = faktoriel(U + R) / (faktoriel(R)*faktoriel(U));
		cout << res;
	}
	else
		cout << 0;
}

int faktoriel(int x) {
	int f = 1, i;
	for (i = 1; i <= x; i++) {
		f *= i;
	}
	return f;
}
