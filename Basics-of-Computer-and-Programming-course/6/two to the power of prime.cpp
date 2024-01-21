#include <iostream>
using namespace std;
int main() {
	int i = 2, j, n, found, q;
	cin >> n;
	while (n > 1) {
		found = 0;
		while (!found) {
			if (n%i == 0) {
				j = 2;
				while (j <= i / 2 && (i%j) != 0)
					j++;
				if (j == 2 || (i%j) != 0)
					found = 1;
			}
			i++;
		}
		i--;
		q = 0;
		while (n%i == 0) {
			n = n / i;
			q++;
		}
		if (q == 1) {
			cout << i;
			if (n != 1)
				cout << "*";
		}
		if (i == 1) {
			cout << q;
			if (n != 1)
				cout << "*";
		}
		if (q > 1 && i > 1) {
			cout << i << "^" << q;
			if (n != 1)
				cout << "*";
			else
				cout << "\n";
		}
		i++;
	}
	return 0;
}