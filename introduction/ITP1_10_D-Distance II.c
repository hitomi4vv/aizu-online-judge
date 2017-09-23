#include <stdio.h>
#include <math.h>
int main() {
  int n, i;
  double x[101], y[101], d, d1 = 0, d2 = 0, d3 = 0, max = 0;
  scanf("%d",&n);
  for(i = 0; i < n; i++) scanf("%lf", &x[i]);
  for(i = 0; i < n; i++) scanf("%lf", &y[i]);
  for(i = 0; i < n; i++) {
    d = x[i] - y[i];
    d1 += fabs(d);
    d2 += pow(fabs(d), 2);
    d3 += pow(fabs(d), 3);
    if(max < fabs(d)) max = fabs(d);
  }
  printf("%f\n%f\n%f\n%f\n", d1, sqrt(d2), cbrt(d3), max);
  return 0;
}
