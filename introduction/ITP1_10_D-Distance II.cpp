#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;
int main() {
  int n, i;
  cin >> n;
  double x[n], y[n], d, d1 = 0, d2 = 0, d3 = 0, max = 0;
  for(i = 0; i < n; i++) cin >> x[i];
  for(i = 0; i < n; i++) cin >> y[i];
  for(i = 0; i < n; i++) {
    d = abs(x[i] - y[i]);
    d1 += d;
    d2 += d * d;
    d3 += d * d * d;
    if(max < d) max = d;
  }
  cout << fixed << setprecision(5) << d1 << endl << sqrt(d2) << endl << cbrt(d3) << endl << max << endl;
  return 0;
}
