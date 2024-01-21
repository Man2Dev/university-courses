#include <iostream>
#include <cmath>
using namespace std;
bool square(int n) {
	int i = 1, j = 3, s = 0, count = 0; bool v = 0;
	do {
		s = i;
		i += j;
		j += 2;
		count++;
		if (s == n) {
			v = 1;
		}
		else {
		}
	} while (count < n / 2);
	if (v == 1) {
		return true;
	}
	else {
		return false;
	}
}
bool Prime(int n) {
	int i;
	if (n <= 3) {
		return true;
	}
	for (i = 2; i <= sqrt(n); i++) {
		if (n%i == 0) {
			return false;
		}
	}
	return true;
}
int main()
{
	int n;
	cin >> n;
	if (square(n) == true) {
		int i, j, p, sum = 0;
		for (i = 2; i <= n; i++) {
			p = 1;
			j = 2;
			while (j < i) {
				if (i % j == 0) {
					p = 0;
					break;
				}
				j++;
			}
			if (p == 1) {
				sum += j;
			}
		}
		cout << sum << endl;
	}
	if (Prime(n) == true) {
		int sum = 0, i, j;
		for (i = 1; i < n; i++) {
			for (j = 1; j*j <= i; j++) {
				if (j*j == i)
					sum += i;
			}
		}
		cout << sum << endl;
	}
	if (square(n) == false && Prime(n) == false) {
		cout << n;
	}
	return 0;
}