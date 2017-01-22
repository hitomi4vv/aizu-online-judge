#include <stdio.h>

int main(void) {
  int count = 1, line;
  scanf("%d", &line);
  while (line != 0) {
    printf("Case %d: %d\n", count, line);
    scanf("%d", &line);
    count++;
  }
  return 0;
}
