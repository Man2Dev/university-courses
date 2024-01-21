#include <iostream>
using namespace std;
int main()
{
	float x, y;
	float addition, subtraction, multiplication, division;
	cin >> x >> y;
	addition = x + y;
	subtraction = x - y;
	multiplication = x * y;
	division = x / y;
	cout << x << " + " << y << " = " << addition << "\n";
	cout << x << " - " << y << " = " << subtraction << "\n";
	cout << x << " * " << y << " = " << multiplication << "\n";
	cout << x << " / " << y << " = " << division << "\n";
	return 0;
}