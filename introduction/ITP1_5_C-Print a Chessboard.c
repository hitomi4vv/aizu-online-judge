#include <stdio.h>

int main(void) {
  int h, w, i, j;
  while(1) {
    scanf("%d %d", &h, &w);
    if(h + w == 0) break;
    for(i = 0; i < h; i++)
      for(j = 0; j < w; j++)
        printf("%s%s", !((i%2 + j%2)%2)? "#":".", j == w-1? "\n":"");
    printf("\n");
  }
  return 0;
}
