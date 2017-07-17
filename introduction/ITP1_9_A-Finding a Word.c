#include <stdio.h>
int main() {
  char w[11], t[1001];
  scanf("%s", w);
  char* s;
  int c = 0;
  while(scanf("%s", t), strcmp(t, "END_OF_TEXT")) {
    for(s = t; *s; s++) *s = tolower(*s);
    if(!strcmp(w, t)) c++;
  }
  printf("%d\n", c);
  return 0;
}
