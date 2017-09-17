#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;
int main() {
  int n;
  while(cin >> n, n != 0) {
    double s[1001], m = 0, sum = 0;
    for(int i = 0; i < n; i++) cin >> s[i], m += s[i], sum += s[i]*s[i];
    m /= n;
    cout << sqrt(sum/n-m*m) << endl;
  }
  return 0;
}
