#include <stdio.h>
#include <math.h>
int main() {
  int n, i;
  while(scanf("%d", &n), n != 0) {
    double s[1001] = {}, m = 0, sum = 0;
    for(i = 0; i < n; i++) {
      scanf("%lf", &s[i]);
      m += s[i];
      sum += s[i]*s[i];
    }
    m /= n;
    printf("%f\n", sqrt(sum/n-m*m));
  }
  return 0;
}
