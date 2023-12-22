#include <iostream>
using namespace std;
int main() {
    int i = 0, a = 0, b = 0;
    do { i++;
	int n, x, y, r = 0;
		cin >> x;
		n = x;
		do {
			y = x % 10;
			r = (r * 10) + y;
			x = x / 10;
			} while (x != 0);
			if (n == r)
			a += 1;
			else 
			b += 1;
	} while (i < 3);
	if (a == 1 && b == 2 || a == 3 && b == 0){
		cout << "YES";
	}
	if (a == 2 && b == 1 || a == 0 && b == 3){
		cout << "NO";
	}
			return 0;
}