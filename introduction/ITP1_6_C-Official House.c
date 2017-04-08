#include <stdio.h>

int main() {
  int n, b, f, r, v, i;
  int arr[4][3][10] = {0};
  scanf("%d", &n);
  for(i = 0; i < n; i++) {
    scanf("%d %d %d %d", &b, &f, &r, &v);
    arr[b-1][f-1][r-1] += v;
  }
  for(b = 0; b < 4; b++) {
    if(b > 0) printf("####################\n");
    for(f = 0; f < 3; f++) {
      for(r = 0; r < 10; r++) printf(" %d", arr[b][f][r]);
      printf("\n");
    }
  }
  return 0;
}
