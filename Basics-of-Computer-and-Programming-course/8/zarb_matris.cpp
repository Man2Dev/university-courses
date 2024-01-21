#include <iostream>
using namespace std;

int main()
{
	int a[50][50], b[50][50], mult[50][50], r1, c1, r2, c2, i, j, k;
	cin >> r1 >> c1 >> c2;
	for (i = 0; i < r1; ++i)
		for (j = 0; j < c1; ++j)
		{
			cin >> a[i][j];
		}
	for (i = 0; i < c1; ++i)
		for (j = 0; j < c2; ++j)
		{
			cin >> b[i][j];
		}
	for (i = 0; i < r1; ++i)
		for (j = 0; j < c2; ++j)
		{
			mult[i][j] = 0;
		}

	for (i = 0; i < r1; ++i)
		for (j = 0; j < c2; ++j)
			for (k = 0; k < c1; ++k)
			{
				mult[i][j] += a[i][k] * b[k][j];
			}

	for (i = 0; i < r1; ++i)
		for (j = 0; j < c2; ++j)
		{
			cout << mult[i][j] << " ";
			if (j == c2 - 1)
				cout << endl;
		}

	return 0;
}