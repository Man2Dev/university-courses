#include <iostream>
using namespace std;
int main()
{
	float m;
	int a;
	const float pi = 3.14;
	cin >> m;
	a = 2 * (pi*m*m) / 4 - m*m;
	cout << a << "\n";
	a = pi*2*m / 2;
	cout << a << "\n";
	return 0;
}