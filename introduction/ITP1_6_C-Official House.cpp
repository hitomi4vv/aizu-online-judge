#include <iostream>
using namespace std;

int main() {
  int n, b, f, r, v;
  int arr[4][3][10] = {0};
  cin >> n;
  for(int i = 0; i < n; i++) {
    cin >> b >> f >> r >> v;
    arr[b-1][f-1][r-1] += v;
  }
  for(b = 0; b < 4; b++) {
    if(b > 0) cout << "####################" << endl;
    for(int f = 0; f < 3; f++) {
      for(int r = 0; r < 10; r++) cout << ' ' << arr[b][f][r];
      cout << endl;
    }
  }
  return 0;
}
