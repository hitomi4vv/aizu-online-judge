#include <stdio.h>
int main() {
  int i, s[26] = {0};
  char c;
  while(scanf("%c", &c) != EOF) s[tolower(c)-'a']++;
  for(i = 0; i < 26; i++) printf("%c : %d\n", i+'a', s[i]);
  return 0;
}
