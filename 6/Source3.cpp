#include<iostream>
using namespace std;
int main()

{
	int a[100], n, i, j, temp;
	for (i = 0; i<100; ++i)
		cin >> a[i];
	for (i = 1; i<100; ++i)
	{
		for (j = 0; j<(100 - i); ++j)
			if (a[j]<a[j + 1])
			{
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
	}
	for (i = 0; i<100; ++i)
		cout << a[i] << " ";
	return 0;
}