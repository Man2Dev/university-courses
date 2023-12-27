#include <iostream>
using namespace std;
int main()
{
	int n, sum=0;
	cin >> n;
	for (int i = 1; i <= n; i++)
		sum += i;
	for (int i = 1; i <= n; i++)
		sum += i;
		sum = sum - (n -1);
	cout << sum;
	return 0;
}