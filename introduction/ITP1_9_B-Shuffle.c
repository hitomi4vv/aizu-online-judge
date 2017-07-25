#include <stdio.h>
int main() {
  char s[201];
  int i, n, h;
  while(scanf("%s", s), strcmp(s, "-")) {
    scanf("%d", &n);
    for(i = 0; i < n; i++) {
      scanf("%d", &h);
      //TODO: wip
      printf("%d\n", h);
    }
    printf("%s\n", s);
  }
  return 0;
}
