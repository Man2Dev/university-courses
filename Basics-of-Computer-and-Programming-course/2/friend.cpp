#include <iostream>
using namespace std;
int main()
{
	int x, y, i, j, f, h = 0; bool u = false;
	cin >> x >> y;
	for (i = x + 1; i < y; i++) {
		h = 0;
		for (j = 2; j < i; j++) {
			if (i%j == 0)
				h = 1;
		}
		if (!h && u == false) {
			u = true;
			cout << i;
		}
		else if (!h)
			cout << "," << i;
	}
	return 0;
}