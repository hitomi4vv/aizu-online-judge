#include <stdio.h>
#include <math.h>
int main() {
  int n, i;
  double x[101], y[101];
  scanf("%d",&n);
  for(i = 0; i < n; i++) scanf("%lf", &x[i]);
  for(i = 0; i < n; i++) scanf("%lf", &y[i]);
  return 0;
}
