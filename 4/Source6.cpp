#include <iostream>
using namespace std;
int main()
{
	char x;
	do {
		cin >> x;
		if (x >= 65 && x <= 90) //upper case
			cout << "U";
		else if (x >= 97 && x <= 122) //lower case
			cout << "L";
		if (x == 42)
			break;
	} while (1);
	return 0;
}