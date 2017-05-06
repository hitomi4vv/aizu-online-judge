#include <stdio.h>
#include <math.h>

int main() {
  int n, x, i, c;
  while(1) {
    scanf("%d %d", &n, &x);
    if(n+x == 0) break;
    c = 0;
    for(i = 1; i < x/3; i++) c += fmax(fmin(n, (x-i+1)/2) - fmax(i+1, x-i-n), 0);
    printf("%d\n", c);
  }
  return 0;
}
