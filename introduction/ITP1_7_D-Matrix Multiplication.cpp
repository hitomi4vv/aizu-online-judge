#include <iostream>
#define rep(i,n)for(int i=0;i<n;i++)
using namespace std;
int main() {
  int n, m, l, a[100][100], b[100][100];
  cin >> n >> m >> l;
  rep(i, n) rep(j, m) cin >> a[i][j];
  rep(i, m) rep(j, l) cin >> b[i][j];
  rep(i, n)
    rep(j, l) {
      long c = 0;
      rep(k, m) c += a[i][k] * b[k][j];
      cout <<  c << (j+1==l?'\n':' ');
    }
  return 0;
}
