#include <iostream>
using namespace std;
int main()
{
	int i, count = 0, count2 = 0, n = 1;
	int a[20];
	for (i = 0; i < 20; i++) {
		cin >> a[i];
		if (a[i] == 0)
			n = 0;
	}
	for (i = 1; i < 21; i++) {
		count = 0;
		for (int j = 0; j < 20; j++)
			if (a[j] == i)
				count++;
		if (count != i && count !=0) {
			n = 0;
		}
	}
	if (n == 1) {
		cout << "YES";
	}
	if (n == 0) {
		cout << "NO";
	}
	return 0;
}