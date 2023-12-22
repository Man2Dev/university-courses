#include <iostream>
using namespace std;
int main()
    {
    unsigned long a[10], x, t, i = 0, max = 1;
    cin >> x;
    if (x == 1) {
        cin >> t;
        cout << t;
        }
    if (x > 1) {
        for (i = 0; i < x; i++) {
            cin >> a[i];
            	}
        max = a[0]<a[1]?a[1]:a[0];
        for (i = 2 ;i < x ;i++) {
        max = a[i]<max?max:a[i];
            }
             cout << max;
        }
    return 0;
}