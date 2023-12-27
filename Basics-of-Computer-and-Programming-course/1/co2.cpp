#include <iostream>
using namespace std;
int main()
{
	int x, y;
	cin >> x >> y;
	if (y >= 1 && y <= 10)
		cout << "Right " << 11 - x << " " << y;
	else if (y >= 11 && y <= 20)
		cout << "Left " << 11 - x << " " << 21 - y;
	return 0;
}