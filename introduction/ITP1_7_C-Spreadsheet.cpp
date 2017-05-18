#include <iostream>
using namespace std;
int main() {
  int r, c, v, rsum[101]={}, csum[101]={};
  cin >> r >> c;
  for(int i = 0; i <= r; i++)
    for(int j = 0; j <= c; j++) {
      if(i < r && j < c) {
        cin >> v;
        rsum[i] += v;
        csum[j] += v, csum[c] += v;
      }
      cout << (i==r?csum[j]:(j==c?rsum[i]:v)) << (j==c?'\n':' ');
    }
  return 0;
}
