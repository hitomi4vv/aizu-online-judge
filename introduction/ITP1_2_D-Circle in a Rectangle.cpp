#include <iostream>
using namespace std;

int main(void) {
  int w, h, x, y, r;
  cin >> w >> h >> x >> y >> r;
  if (r <= x && x <= w - r && r <= y && y <= h - r) {
    cout << "Yes" << endl;
  } else {
    cout << "No" << endl;
  }
  return 0;
}
