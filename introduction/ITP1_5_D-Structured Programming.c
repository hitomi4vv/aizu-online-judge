#include <stdio.h>

int main(void) {
  int n, i;
  char s[5];
  scanf("%d", &n);
  for(i = 3; i <= n; i++) {
    sprintf(s, "%d", i);
    if(i%3 == 0 || strstr(s, "3")) printf(" %d", i);
  }
  printf("\n");
  return 0;
}
