#include <iostream>
using namespace std;
int main()
{
	int a1, b1, a2, b2, a3, b3;
	cin >> a1 >> b1 >> a2 >> b2 >> a3 >> b3;
	if (a3 == 0 || b2 == 0 || a1 - a3 < 0 || b1 - b2 < 0)
		cout << "you disappoint newton";
	else
		cout << a1 - a3 << " " << b1 - b2;
	return 0;
}