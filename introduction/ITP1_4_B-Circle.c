#include <stdio.h>
#include <math.h>

int main(void) {
  double r;
  scanf("%lf", &r);
  printf("%f %f\n", r*r*M_PI, 2*M_PI*r);
  return 0;
}
