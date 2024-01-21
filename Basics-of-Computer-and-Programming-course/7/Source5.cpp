#include <iostream>
using namespace std;
string sortMyString(string str) {
	int i, j;
	char temp;
	string g;
	for (i = 1; i < str.length(); ++i) {
		for (j = 0; j < (str.length() - i); ++j)
			if (str[j] > str[j + 1]) {
				temp = str[j];
				str[j] = str[j + 1];
				str[j + 1] = temp;
			}
	}
	for (i = 0; i < str.length(); ++i) {
		if (i > 0) {
			g = g + str[i] + " ";
		}
	}
	return g;
}
string removeRepetitive(string w) {
	string g;
	g = g + w[0];
	for (int i = 1; i <= w.length(); i++) {
		bool matching = false;
		for (int j = 0; (j < i) && (matching == false); j++) {
			if (w[i] == w[j]) {
				matching = true;
			}
		}
		if (!matching) {
			g = g + w[i];
		}
	}
	return g;
}
int main()
{
	string str;
	cin >> str;
	cout << sortMyString(removeRepetitive(str));
	return 0;
}