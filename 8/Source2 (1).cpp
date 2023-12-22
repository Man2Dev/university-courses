#include <iostream>
using namespace std;

int main()
{
	int x, s;
	char c;
	cin >> x >> c >> s;
	int a[4][4]; //= { {1,2,3,4},{5,6,7,8},{9,8,7,6},{5,4,3,2} };
	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 4; j++) {
			cin >> a[i][j];
		}
	}
	if (c == 'R') {
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++) {
				cout << a[(s + i) % 4][j] << " ";
			}
			cout << endl;
		} //(s + i) % 4 (s + j) % 4
	} //(i + 4 - s) % 4 (j + 4 - s) % 4
	if (c == 'L') {
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++) {
				cout << a[(i + 4 - s) % 4][j] << " ";
			}
			cout << endl;
		}
	}
}