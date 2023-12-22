sing namespace std; //من 3 روزه دارم سر این کار می کنم و میدونم باید ورودی رو بر عکس حساب می کردم ولی
int main()//هر دفه به مشکل بر می خردم و این همه
{ //به دلیل تریس بود و همچنین اسم  ها ها را به اسم های اصلی تقییر دادام تا کد فهمید اش اسان تر باشهcout 
	long binary, decimal = 0, temp = 0, a, number, base = 1, count = 0, j = 0, i = 3, g = 1, l = 1, n, v = 0;
	cin >> number;
	binary = number;
	temp = binary;
	while (number > 0)
	{
		a = number % 10;
		decimal += a * base;
		base *= 2;
		number /= 10;
		count++;
		v = a;
		cout << "----answer = " << decimal << endl;
		cout << "numbers in the while = " << number << endl;
		if (count == i) {
			cout << "the numbers (in 1th if (" << g << ")) = " << number << endl;
			cout << "the i (in 1th if (" << g << ")) = " << i << endl;
			cout << "-----answer (in 1th if (" << g << ")) = " << decimal << endl;
			cout << endl;
			i++;
			++g;
			if (count < i) {
				for (j = 0; j < 1; j++) {
					number += v;
				}
				cout << "the numbers (in 2th if (" << l << ")) = " << number << endl;
				a = number % 10;
				decimal += a * base;
				cout << "answer (in 2th if (" << l << ")) = " << decimal << endl << "\n";
				base *= 2;
				number /= 10;
				cout << "the numbers2 (in 2th if (" << l << ")) = " << number << endl;
				++l;
				break;
			}
		}
	}
	cout << endl << "count = " << count << endl;
	cout << "answer = " << decimal << endl;
	return 0;
}