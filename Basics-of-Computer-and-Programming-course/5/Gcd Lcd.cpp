#include<iostream>
using namespace std;
int main()
{
		long long a , b , c , n , m;
		cin >> a >> b;
		//max: a , min: b
		if ( a > b )
		{
			c=a;
			a=b;
			b=c;
		}
		n=a;
		m=b;
		// BMM
		while(b>0)
			{
			c=a%b;
			a=b;
			b=c;
			}
			cout << a;
		// KMM
			cout << " " << n*m/a;
		return 0;
}