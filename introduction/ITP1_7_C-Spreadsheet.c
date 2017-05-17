#include <stdio.h>
int main() {
  int r, c, v, i, j, rsum[101]={0}, csum[101]={0};
  scanf("%d %d", &r, &c);
  for(i = 0; i <= r; i++)
    for(j = 0; j <= c; j++) {
      if(i < r && j < c) {
        scanf("%d", &v);
        rsum[i] += v;
        csum[j] += v, csum[c] += v;
      }
      printf("%d%s", i==r?csum[j]:j==c?rsum[i]:v, j==c?"\n":" ");
    }
  return 0;
}
