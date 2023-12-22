#include <iostream>
#include <string>
using namespace std;
int main() {
	string a;
	string b;
	int j = 0, i = 0, x = 0, y = 0, v = 0, count = 0; bool f = 0, d = 0;
	cin >> a >> b;
	x = a.length();
	y = b.length();
	do {
		v++;
		if (a[i] == b[j]) {
			count++;
			i++;
			j++;
		}
		else {
			i;
			j++;
		}
		if (count == x) {
			f = 1;
		}
		else if (count != x) {
			d = 1;
		}
	} while (v < y);
	if (f == 1) {
		cout << "YES";
	}
	else if (d == 1) {
		cout << "NO";
	}
	return 0;
}