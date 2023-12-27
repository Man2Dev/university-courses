#include <iostream>
using namespace std;

void* map(int *, int, int);
int main() {
	int *a, *b, n, i, j, max, max2;
	string *r;
	cin >> n;
	a = new int[n];
	cin >> a[0];
	max = a[0];
	for (i = 1; i<n; i++) {
		cin >> a[i];
		if (max<a[i])
			max = a[i];
	}
	b = new int[max + 1];

	for (i = 1; i <= max; i++)
	{
		b[i] = 0;
		for (j = 0; j<n; j++) {
			if (a[j] == i)
				b[i]++;
		}
	}

	max2 = b[1];
	for (i = 1; i <= max; i++)
		if (max2<b[i])
			max2 = b[i];
	map(b, max2, max);
	return 0;
}
void* map(int *b, int m, int n) {
	string r[m + 1][n + 1];
	int i, j;
	for (i = 1; i <= m; i++) {
		for (j = 1; j <= n; j++)
			r[i][j] = " ";
	}
	for (i = 1; i <= n; i++) {
		if (b[i] != 0) {
			for (j = 0; j<b[i]; j++)
				r[m - j][i] = "*";
		}
	}

	for (i = 1; i <= m; i++) {
		for (j = 1; j <= n; j++)
			cout << r[i][j];
		cout << endl;
	}
}
