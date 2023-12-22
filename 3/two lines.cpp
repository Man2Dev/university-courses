#include <iostream>
using namespace std;
int main()
{
	double a, b, c, a2, b2, c2, x = 0, y = 0;
	cin >> a >> b >> c >> a2 >> b2 >> c2;
	if (a*b2 - b*a2 == 0) {
		cout << "No Solution";
	}
	else {
		x = (b2 / (a*b2 - b*a2))*c + (-b / (a*b2 - b*a2))*c2;
		y = (-a2 / (a*b2 - b*a2))*c + (a / (a*b2 - b*a2))*c2;
		cout << "(" << x << ", " << y << ")";
	}
	return 0;
}