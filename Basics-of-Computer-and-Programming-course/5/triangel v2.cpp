#include <iostream>
using namespace std;
int main()
{
	int n; cin >> n;
	bool done = false;
	for(int i=1; i<=n/3+1; i++)
		  for(int j=1; j<n-i && !done; j++)
		  {
		  	int a = i, b = j, c = n-(i+j); if(a*a+b*b==c*c||c*c+a*a==b*b||b*b+c*c==a*a)
		  	{
		  		cout << i << ' ' << j << ' ' << n-(i+j);
		  		done = true;
		  		}
		  	}
		 if(!done)
		 	 cout << "Impossible";
	return 0;
}