#include <stdio.h>

int main(void) {
  int w, h, x, y, r;
  scanf("%d %d %d %d %d", &w, &h, &x, &y, &r);
  if (r <= x && x <= w - r && r <= y && y <= h - r) {
    printf("Yes\n");
  } else {
    printf("No\n");
  }
  return 0;
}
