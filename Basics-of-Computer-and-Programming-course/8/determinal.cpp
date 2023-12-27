#include <iostream>
using namespace std;

int main()
{
	int a1, a2, a3, b1, b2, b3, c1, c2, c3;
	cin >> a1 >> b1 >> c1 >> a2 >> b2 >> c2 >> a3 >> b3 >> c3;
	cout << ((a1*b2*c3) + (b1*c2*a3) + (c1*a2*b3)) - ((a3*b2*c1) + (b3*c2*a1) + (c3*a2*b1));
}