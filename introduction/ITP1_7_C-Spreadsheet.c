#include <stdio.h>

int main() {
  int r, c, v, i, j;
  scanf("%d %d", &r, &c);
  int rsum, csum[101] = {};
  for(i = 0; i < r; i++) {
    rsum = 0;
    for(j = 0; j < c; j++) {
      scanf("%d", &v);
      printf("%d ", v);
      rsum += v;
      csum[j] += v;
    }
    printf("%d\n", rsum);
  }
  rsum = 0;
  for(j = 0; j < c; j++) {
    rsum += csum[j];
    printf("%d ", csum[j]);
  }
  printf("%d\n", rsum);
  return 0;
}
