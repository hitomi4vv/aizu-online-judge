#include <iostream>
using namespace std;

int main(void) {
  long n, num, minnum = 1000000, maxnum = -1000000, sum = 0;
  cin >> n;
  while(n--) {
    cin >> num;
    minnum = min(minnum, num);
    maxnum = max(maxnum, num);
    sum += num;
  }
  cout << minnum << ' ' << maxnum << ' ' << sum << endl;
  return 0;
}
