#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;
int main() {
  double a, b, c, h;
  cin >> a >> b >> c;
  c = c*3.1415926/180;
  h = b*sin(c);
  cout << fixed << setprecision(5) << a*h*.5 << endl << a+b+sqrt(a*a+b*b-2*a*b*cos(c)) << endl << h << endl;
  return 0;
}
