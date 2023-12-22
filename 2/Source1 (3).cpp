#include <iostream>
using namespace std;
int main()
{
	int x, y, a, b;
	cin >> x;
	if (x <= 15)
		cout << "No Solution\n";
	for (a = 15; a < x; a += 15)
		cout << a << "\n";
	return 0;
}