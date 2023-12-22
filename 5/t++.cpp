#include <iostream>
using namespace std;
int main()
{
	int n, a, b, c, i = 0, last, mid, first;
	cin >> n;
	for (a = 1; a <= n; a++) {
		for (b = 1; b <= n; b++) {
			for (c = 1; c <= n; c++) {
				if ((a*a) + (b*b) == c*c || (a*a) + (c*c) == b*b || (c*c) + (b*b) == a*a) {
					if (a <= b && b <= c){
						a == n - b - c;
						b == n - a - c;
						c == n - a - b;
						if (a + b + c == n){
						cout << a << " " << b << " " << c << endl;
						}
					}
				}
			}
		}
	}
	return 0;
}