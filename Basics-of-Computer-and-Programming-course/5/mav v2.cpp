#include <iostream>
using namespace std;
int main ()
{
	int n, a, maximum;
	cin >> n >> a;
	maximum = a;
	for(int i=1; i<n; i++){
		cin >> a;
		if(a > maximum) maximum = a;
		}
		cout << maximum;
	return 0;
}