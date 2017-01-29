#include <iostream>
using namespace std;

int main(void) {
  int a, b, c, count = 0;
  cin >> a >> b >> c;
  while (a <= b) {
    if (c % a == 0) {
      count++;
    }
    a++;
  }
  cout << count << endl;
  return 0;
}
