#include <stdio.h>

int main(void) {
  int a, b;
  char op;
  do {
    scanf("%d %s %d", &a, &op, &b);
    if(op == '+') {
      printf("%d\n", a+b);
    } else if(op == '-') {
      printf("%d\n", a-b);
    } else if(op == '*') {
      printf("%d\n", a*b);
    } else if(op == '/') {
      printf("%d\n", a/b);
    }
  } while(op != '?');
  return 0;
}
