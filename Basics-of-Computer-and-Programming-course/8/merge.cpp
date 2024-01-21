#include <iostream>
using namespace std;

int n, m;
int* merge(int *a, int *b);
int main() {
	int *a, *b, i, *c;
	c = new int[m + n];
	cin >> n;
	a = new int[n];
	for (i = 0; i<n; i++)
		cin >> a[i];
	cin >> m;
	b = new int[m];
	for (i = 0; i<m; i++)
		cin >> b[i];
	c = merge(a, b);
	for (i = 0; i<n + m; i++)
		cout << c[i] << " ";
	return 0;
}
int* merge(int* a, int* b) {
	int *c;
	c = new int[m + n];
	int i = 0, j = 0, k;
	for (k = 0; k<n + m; k++) {
		if (i<n && j<m) {
			if (a[i]>b[j]) {
				c[k] = b[j];
				j++;
			}
			else
			{
				c[k] = a[i];
				i++;
			}
		}
		else {
			if (i<n && m <= j) {
				c[k] = a[i];
				i++;
			}
			if (j<m && i >= n)
				c[k] = b[j];
			j++;
		}
	}
	return c;
}
