#include<stdio.h>
#include<math.h>

int main(void) {
  int n, num;
  long minnum = 1000000, maxnum = -1000000, sum = 0;
  scanf("%d", &n);
  while(n--) {
    scanf("%d", &num);
    minnum = fmin(minnum, num);
    maxnum = fmax(maxnum, num);
    sum += num;
  }
  printf("%d %d %ld\n", minnum, maxnum, sum);
  return 0;
}
