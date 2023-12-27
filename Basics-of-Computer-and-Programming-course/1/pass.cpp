#include <iostream> 
using namespace std;
int main()
{ 
int x, y, a;
 cin >> x >> y;
  a = x / 7;
  if (y >= 0 && y <= 1)
   		a++;
   		if (x % 7 == 2 && y == 6)
   		a++;
  if (x >= 21 && x <= 10000) 		
  a = a - 2;
  cout << a;
  return 0;
   }