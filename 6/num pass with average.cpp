#include <iostream>
using namespace std;
int main() {
	int i, count = 0;
	float a[80], sum = 0.0, average;
	for (i = 0; i < 80; ++i) {
		cin >> a[i];
		sum += a[i];
	}
	average = sum / 80;
	for (i = 0; i < 80; ++i) {
		if (average <= a[i]) {
			count++;
		}
	}
	cout << count;
	return 0;
}