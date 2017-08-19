#include <stdio.h>
#include <string.h>
int main() {
  int n, i, j, a, b;
  char s[1001], ss[1001], o[7], p[1001];
  scanf("%s %d", s, &n);
  for(i=0; i<n; i++) {
    scanf("%s %d %d", o, &a, &b);
    if(!strcmp(o, "print")) {
      for(j=a;j<=b;j++) printf("%c", s[j]);
      printf("\n");
    }
    if(!strcmp(o, "reverse")) {
      strcpy(ss, s);
      for(j=a;j<=b;j++) s[j]=ss[b-(j-a)];
    }
    if(!strcmp(o, "replace")) {
      scanf("%s", p);
      for(j=a;j<=b;j++) s[j]=p[j-a];
    }
  }
  return 0;
}
