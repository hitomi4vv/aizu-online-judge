#include <stdio.h>
#include <string.h>
int main() {
  char s[201], b[201];
  int i, n, h;
  while(scanf("%s", s), strcmp(s, "-")) {
    scanf("%d", &n);
    for(i = 0; i < n; i++) {
      scanf("%d", &h);
      strcpy(b, s+h);
      strncat(b, s, h);
      strcpy(s, b);
    }
    printf("%s\n", s);
  }
  return 0;
}
