#include <stdio.h>
int main() {
  int n, m, l, i, j, k;
  int a[100][100]={0}, b[100][100]={0};
  scanf("%d %d %d", &n, &m, &l);
  for(i = 0; i < n; i++) for(j = 0; j < m; j++) scanf("%d", &a[i][j]);
  for(i = 0; i < m; i++) for(j = 0; j < l; j++) scanf("%d", &b[i][j]);
  for(i = 0; i < n; i++)
    for(j = 0; j < l; j++) {
      c = 0;
      for(k = 0; k < m; k++) c += a[i][k] * b[k][j];
      printf("%ld%s", c, j+1 == l? "\n" : " ");
    }
  return 0;
}
