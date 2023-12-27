#include<iostream>
using namespace std;

int det(int**f, int size);
int pow(int a, int b);
int main() {
	int**a, c, **f, determinant = 0;
	c = 3;

	a = new int*[c];
	for (int i = 0; i<c; i++) {
		a[i] = new int[c];
		for (int j = 0; j<c; j++)
			cin >> a[i][j];
	}
	f = new int*[c - 1];
	for (int i = 0; i<c - 1; i++)
		f[i] = new int[c - 1];
	for (int i = 0; i<c; i++) {
		for (int j = 0; j<c - 1; j++) {
			int flg = 0;
			for (int k = 0; k<c - 1; k++) {
				if (k == i)
					flg = 1;
				f[j][k] = a[j + 1][k + flg];
			}
		}
		determinant += pow(-1, i)*a[0][i] * det(f, c - 1);
	}

	cout << determinant;
}

int pow(int a, int b) {
	int sum = 1;
	for (int i = 0; i<b; i++)
		sum = sum*a;
	return sum;
}
int det(int**f, int size) {
	return f[0][0] * f[1][1] - f[0][1] * f[1][0];
}
