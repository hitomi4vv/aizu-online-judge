#include <stdio.h>
int main() {
  char ss[202], s[101], p[101];
  scanf("%s%s", s, p);
  strcpy(ss, s);
  strcat(ss, s);
  printf("%s\n", strstr(ss, p)!=NULL? "Yes":"No");
  return 0;
}
