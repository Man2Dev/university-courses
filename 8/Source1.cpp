#include <iostream>
using namespace std;

int main()
{
	int a1, a2, a3, b1, b2, b3, c1, c2, c3;
	cin >> a1;
	cin >> b1;
	cin >> c1;
	cin >> a2;
	cin >> b2;
	cin >> c2;
	cin >> a3;
	cin >> b3;
	cin >> c3;
	cout << ((a1*b2*c3) + (b1*c2*a3) + (c1*a2*b3)) - ((a3*b2*c1) + (b3*c2*a1) + (c3*a2*b1));
}
