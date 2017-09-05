#include <stdio.h>
#include <math.h>
int main() {
  double a, b, c, h;
  scanf("%lf %lf %lf", &a, &b, &c);
  c = c*3.1415926/180;
  h = b*sin(c);
  printf("%lf\n%lf\n%lf\n", a*h*.5, a+b+sqrt(a*a+b*b-2*a*b*cos(c)), h);
  return 0;
}
