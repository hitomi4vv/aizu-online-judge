#include <iostream>
using namespace std;

int main() {
  int n, x, c;
  while(cin >> n >> x, n+x != 0) {
    c = 0;
    for(int i = 1; i < x/3; i++) c += max(min(n, (x-i+1)/2) - max(i+1, x-i-n), 0);
    cout << c << endl;
  }
  return 0;
}
