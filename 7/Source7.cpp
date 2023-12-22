#include <iostream>
using namespace std;

int factorial(int x) {
	int factorial = 1;
	for (int i = 1; i <= x; ++i) {
		factorial *= i;
	}
	return factorial;
}
int entekhab(int r, int n) {
	return factorial(n) / (factorial(r)*factorial(n - r));
}
int enteghab(int r, int n) {
	return ((n*n) - (n*r));
}
bool enteghab_is_entekhab(int r, int n) {
	if (entekhab(r, n) != enteghab(r, n)) {
		return false;
	}
	else {
		return true;
	}
}
void solve_problem() {
	int x, r, n, count = 0, o[100], v = 0; bool d = 0;
	cin >> x;
	for (int i = 1; i <= x; i++) {
		cin >> r >> n;
		if (enteghab_is_entekhab(r, n) == false) {
			count++;
			d = 1;
			o[count] = i;
		}
	}
	cout << count << endl;
	if (d = 1) {
		for (int i = 1; i <= count; i++) {
			cout << o[i] << " ";
		}
	}
}

int main()
{
	solve_problem();
	return 0;
}