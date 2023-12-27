#include <iostream>
#include <string>
using namespace std;
int main()
{
	int x;
	cin >> x;
	if (x < 5 || x % 2 == 0)
		cout << "Horrible Logo";
	else {
		cout << "*";
		for (int i = 0; i < x / 2 - 1; i++)
			cout << " ";
		for (int i = 0; i < x / 2 + 1; i++)
			cout << "*";
		cout << "\n";
		for (int i = 0; i < x / 2 - 1; i++) {
			cout << "*";
			for (int i = 0; i < x / 2 - 1; i++)
				cout << " ";
			cout << "*";
			for (int i = 0; i < x / 2; i++)
				cout << " ";
			cout << "\n";
		}
		for (int i = 0; i < x; i++)
			cout << "*";
		cout << "\n";
		for (int i = 0; i < x / 2 - 1; i++) {
			for (int i = 0; i < x / 2; i++)
				cout << " ";
			cout << "*";
			for (int i = 0; i < x / 2 - 1; i++)
				cout << " ";
			cout << "*";
			cout << "\n";
		}
		for (int i = 0; i < x / 2 + 1; i++)
			cout << "*";
		for (int i = 0; i < x / 2 - 1; i++)
			cout << " ";
		cout << "*";
	}
	return 0;
}