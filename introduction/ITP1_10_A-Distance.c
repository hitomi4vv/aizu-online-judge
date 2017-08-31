#include <stdio.h>
int main() {
  double x1, y1, x2, y2;
  double distance;
  scanf("%lf %lf %lf %lf", &x1, &y1, &x2, &y2);
  distance = hypot(x2-x1, y2-y1);
  printf("%f\n", distance);
  return 0;
}
