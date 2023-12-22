#include <iostream>
using namespace std;
int main()
{
	int x, a, b;
	cin >> x;
	a = x / 10 % 10;
	b = x % 10;
	if (a + b >= 10)
		cout << "YES\n";
	else
		cout << "NO\n";
	return 0;
}