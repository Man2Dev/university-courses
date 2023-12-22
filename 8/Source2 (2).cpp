#include <iostream>
using namespace std;

int  path(int m, int n)
{
	if (m == 1 || n == 1)
		return 1;
	return  path(m - 1, n) + path(m, n - 1);
}

int main()
{
	int a, b;
	cin >> a >> b;
	cout << path(a, b);
	return 0;
}