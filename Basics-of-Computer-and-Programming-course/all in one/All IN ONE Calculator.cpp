#include <iostream>
#include <cmath>
using namespace std;
bool home(int n) {
	if (1 > n || n > 8) {
		cout << "you have entered the wrong number please try again.\n";
		return false;
	}
	else {
		return true;
	}
}
bool cal(int n) {
	if (1 > n || n > 5) {
		cout << "you have entered the wrong number please try again.\n";
		return false;
	}
	else {
		return true;
	}
}
bool num_a(int n) {
	if (1000 < n || n < 2) {
		cout << "your number has to be between 2 and a 1000.\nplease try again.\n";
		return false;
	}
	else {
		return true;
	}
}
bool a(int n) {
	if (n > 1000) {
		cout << "your number should be equal or under a 1000.\nplease insert your number again.\n";
		return false;
	}
	else {
		return true;
	}
}
bool t(float n) {
	if (n > 1000) {
		cout << "your number should be equal or under a 1000.\nplease insert your number again.\n";
		return false;
	}
	else {
		return true;
	}
}
bool num_b(int n) {
	if (1000 < n || n < 2) {
		cout << "the size of your array should be between 2 and a 1000.\nplease insert your number again.\n";
		return false;
	}
	else {
		return true;
	}
}
bool b(int n) {
	if (n > 1000) {
		cout << "this number is too big it should be equal or under a 1000.\nplease try another number.\n";
		return false;
	}
	else {
		return true;
	}
}
bool v(int n) {
	if (n > 1000) {
		return false;
	}
	else {
		return true;
	}
}
bool num_c(int n) {
	if (1 > n || 3 < n) {
		cout << "your number should be between 1 and 3.\nplease insert your number again.\n";
		return false;
	}
	else {
		return true;
	}
}
bool num_d(int a, int b) {
	if (a > 1000 || b > 1000) {
		cout << "your numbers should be equal or under a 1000.\nplease insert your number again.\n";
		return false;
	}
	else {
		return true;
	}
}
bool Prime(int n) {
	int i;
	if (n <= 3) {
		return true;
	}
	for (i = 2; i <= sqrt(n); i++) {
		if (n%i == 0) {
			return false;
		}
	}
	return true;
}
int gcd(int a, int b) {
	if (b == 0) {
		return a;
	}
	else {
		return gcd(b, a%b);
	}
}
int lcm(int a, int b) {
	return a*b / gcd(a, b);
}
void stop() {
	cout << endl;
	system("pause");
	cout << endl;
}
void home_page() {
	cout << "\t\t\tHOME PAGE\n1. basic mathematical functions.\n2. checking if a number is a prime number or not.\n3. sorting random numbers.\n4. printing Pascal's triangle.\n5. finding the fibonacci sequence.\n6. finding the gcd(BMM) or lcm(kMM) of integers.\n7. printing a diamond pattern.\n8. exit.\nplease insert the number then press enter: ";
}
void addition() {
	int f;
	cout << "how many numbers do you want to add: ";
	int count = 0;
	float p, sum = 0;
	do {
		cin >> f;
	} while (num_a(f) == false);
	cout << "enter your numbers: ";
	for (int i = 0; i < f; i++) {
		do {
			cin >> p;
		} while (t(p) == false);
		sum += p;
		count++;
		if (count < f) {
			cout << p;
			cout << " + ";
		}
	}
	cout << "answer is = (" << sum << ")" << endl;
	stop();
}
void subtraction() {
	cout << "how many numbers do you want to subtract: ";
	int f, count = 0;
	float p, subt = 0;
	do {
		cin >> f;
	} while (num_a(f) == false);
	cout << "enter your numbers: ";
	for (int i = 0; i < f; i++) {
		do {
			cin >> p;
		} while (t(p) == false);
		if (count < 1) {
			subt = p;
			cout << subt << " - ";
			count++;
		}
		else {
			count++;
			subt = subt - p;
			if (count < f) {
				cout << p;
				cout << " - ";
			}
		}
	}
	cout << "answer is = (" << subt << ")" << endl;
	stop();
}
void multiplication() {
	cout << "how many numbers do you want to multiply: ";
	int f, count = 0;
	float p, mult = 1;
	do {
		cin >> f;
	} while (num_a(f) == false);
	cout << "enter your numbers: ";
	for (int i = 0; i < f; i++) {
		do {
			cin >> p;
		} while (t(p) == false);
		mult *= p;
		count++;
		if (count < f) {
			cout << p;
			cout << " * ";
		}
	}
	cout << "answer is = (" << mult << ")" << endl;
	stop();
}
void division() {
	float p, h;
	cout << "please insert a number and then the number you want it to be divide by:\n";
	do {
		cout << "first number is: ";
		cin >> p;
		cout << "second number is: ";
		cin >> h;
	} while (t(p) == false || t(h) == false);
	cout << p << " / " << h << " = (" << p / h << ")" << endl;
	stop();
}
void basic() {
	int g;
	cout << "which function of the calculator do you want to use insert the number then press enter:\n1. addition(+)\n2. subtraction(-)\n3. multiplication(*)\n4. division(/)\n5. return to home page.\n";
	do {
		cout << "function: ";
		cin >> g;
	} while (cal(g) == false);
	if (g == 1) {//start (+).
		addition();
	}//end (+).
	if (g == 2) {//start (-).
		subtraction();
	}//end (-).
	if (g == 3) {//start (*).
		multiplication();
	}//end (*).
	if (g == 4) {//start (/).
		division();
	}//end (/).
}
void prime() {
	int t;
	cout << "please insert a positive integer: ";
	do {
		cin >> t;
	} while (a(t) == false);
	if (Prime(t) == true) {
		cout << t << " is a prime number.\n";
	}
	else {
		cout << t << " is not a prime number.\n";
	}
	stop();
}
void sort() {
	int a[1000], u, i, j, temp, count = 0;
	cout << "enter the size of array: ";
	do {
		cin >> u;
	} while (num_b(u) == false);
	cout << "enter your integers.\n";
	for (i = 0; i < u; ++i) {
		do {
			count++;
			cout << "your " << count << "th integer is: ";
			cin >> a[i];
			if (v(a[i]) == false) {
				count--;
			}
		} while (b(a[i]) == false);
	}
	for (i = 1; i < u; ++i) {
		for (j = 0; j < (u - i); ++j)
			if (a[j] > a[j + 1]) {
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
	}
	cout << "your sorted numbers are: (";
	for (i = 0; i < u; ++i) {
		cout << a[i];
		if (i != u - 1) {
			cout << ", ";
		}
	}
	cout << ")" << endl;
	stop();
}
void pascal() {
	int n, c, i, j, g;
	cout << "please insert the row number of Pascal's triangle: ";
	do {
		cin >> n;
	} while (a(n) == false);
	for (i = 0; i <= n; i++) {
		c = 1;
		for (j = 1; j <= (n - i); j++) {
			cout << " ";
		}
		cout << "row = " << i << " ";
		for (g = 0; g <= i; g++) {
			cout << " " << c;
			c = c * (i - g) / (g + 1);
		}
		cout << endl;
	}
	stop();
}
void fibonacci() {
	int f1 = 0, f2 = 1, f3 = 1, n, count = 0;
	cout << "enter a positive integer so that the fibonacci sequence can be printed up to it: ";
	do {
		cin >> n;
	} while (a(n) == false);
	if (n == 0) {
		cout << "the fibonacci sequence from 0 up to a " << n << " is: (" << f1 << ")\n";
		stop();
	}
	if (n == 1) {
		cout << "the fibonacci sequence from 0 up to a " << n << " is: (" << f1 << ", " << f2 << ")\n";
		stop();
	}
	if (n > 1) {
		cout << "the fibonacci sequence from 0 up to a " << n << " is: (" << f1 << ", " << f2 << ", ";
		while (f1 + f2 < n) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			cout << f3;
			if (f1 + f2 < n) {
				cout << ", ";
			}
			else {
				cout << ")\n";
				stop();
			}
		}
	}
}
void gcd_lcd() {
	int a, b, e;
	bool s = 0;
	cout << "please insert the number of the function you want to perform:\n1. to perform gcd(BMM).\n2. to perform lcm(KMM).\n3. return to home page.\n";
	do {
		cout << "function: ";
		cin >> e;
	} while (num_c(e) == false);
	if (e == 1) {//bmm/gcd
		bool r = 0;
		do {
			cout << "please insert 2 positive integers:\nyour first integer is: ";
			cin >> a;
			cout << "your second integer is: ";
			cin >> b;
		} while (num_d(a, b) == false);
		cout << "your gcd(BMM) is: (" << gcd(a, b) << ")\n";
		stop();
	}
	else if (e == 2) {//kmm/lcm
		bool r = 0;
		do {
			cout << "please insert 2 positive integers:\nyour first integer is: ";
			cin >> a;
			cout << "your second integer is: ";
			cin >> b;
		} while (num_d(a, b) == false);
		cout << "your lcm(KMM) is: (" << lcm(a, b) << ")\n";
		stop();
	}
}
void diamond() {
	int n;
	cout << "please insert diameter size: ";
	cin >> n;
	cout << endl;
	for (int i = 0; i < n; i++) {
		cout << " ";
		for (int g = 1; g <= n - i; g++)
			cout << " ";
		for (int j = 0; j <= i; j++) {
			cout << "*" << " ";
		}
		cout << endl;
	}
	for (int i = n; i >= 0; i--) {
		cout << " ";
		for (int g = 1; g <= n - i; g++)
			cout << " ";
		for (int j = 0; j <= i; j++) {
			cout << "*" << " ";
		}
		cout << endl;
	}
	stop();
}
void start() {
	int n;
	cout << "\t**************************************\n\t welcome to the All IN ONE Calculator\n\t**************************************\n";
	while (1) {
		home_page();
		do {
			cin >> n;
		} while (home(n) == false);
		if (n == 1) {//**basic**
			basic();
			if (n == 5) {
				break;
			}
		}//basic end.
		if (n == 2) {//**prime**
			prime();
		}//end prime.
		if (n == 3) {//**sort**
			sort();
		}//end sort.
		if (n == 4) {//**pascal**
			pascal();
		}//end pascal.
		if (n == 5) {//**fibonacci**
			fibonacci();
		}//end fibonacci.
		if (n == 6) {//**gcd/lcm**
			gcd_lcd();
			if (n == 3) {
				break;
			}
		}//end gcd/lcm.
		if (n == 7) {//**diamond**
			diamond();
		}//end diamond.
		if (n == 8) {
			break;
		}
	}
}
int main() {
	start();
	return 0;
}