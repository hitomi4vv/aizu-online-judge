#include <stdio.h>
#include <string.h>
int main() {
  int t=0, h=0, n, i, s;
  char a[101], b[101];
  scanf("%d",&n);
  for(i = 0; i < n; i++) {
    scanf("%s %s", a, b);
    s = strcmp(a, b);
    if(s==0){t+=1; h+=1;} else if(s>0) t+=3; else if(s<0) h+=3;
  }
  printf("%d %d\n", t, h);
  return 0;
}
