#include <stdio.h>

int main() {
  int n, m, i, j, sum;
  int a[100][100];
  int b[100];
  scanf("%d %d", &n, &m);
  for(i = 0; i < n; i++) for(j = 0; j < m; j++) scanf("%d", &a[i][j]);
  for(j = 0; j < m ; j++) scanf("%d",&b[j]);
  for(i = 0; i < n; i++) {
    sum = 0;
    for(j = 0; j < m; j++) sum += a[i][j] * b[j];
    printf("%d\n", sum);
  }
  return 0;
}
