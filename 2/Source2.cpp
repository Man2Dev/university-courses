#include <iostream>
using namespace std;
int main()
{
	int m;
	long sum = 0;
	cin >> m;
	for (int i = 1; i <= m; i++) {
		for (int j = 1; j <= i; j++) {
			sum = sum + j;
		}
	}
	cout << sum;
	return 0;
}