#include <iostream>
using namespace std;

int main() {
  int n, m;
  int a[100][100], b[100];
  cin >> n >> m;
  for(int i = 0; i < n; i++) for(int j = 0; j < m; j++) cin >> a[i][j];
  for(int j = 0; j < m; j++) cin >> b[j];
  for(int i = 0; i < n; i++) {
    int sum = 0;
    for(int j = 0; j < m; j++) sum += a[i][j] * b[j];
    cout << sum << endl;
  }
  return 0;
}
