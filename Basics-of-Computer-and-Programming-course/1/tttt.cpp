#include <iostream>
using namespace std;
int main()
{
	int x, y, z, a, b;
	cin >> x >> y >> z;
	a = x + y + z;
	if (a == 180 && x != 0 && y != 0 && z != 0)
		cout << "Yes\n";
	else
		cout << "No\n";
	return 0;
}