#include <iostream>
#include <cmath>
using namespace std;

int main(void) {
  double r;
  cin >> r;
  cout << fixed << r*r*M_PI << ' ' << fixed << 2*M_PI*r << endl;
  return 0;
}
