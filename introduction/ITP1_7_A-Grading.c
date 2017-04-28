#include <stdio.h>

int main() {
  int m, f, r;
  while(1) {
    scanf("%d %d %d", &m, &f, &r);
    if(m + f + r == -3) break;
    char grade = 'F';
    if(m != -1 && f != -1 && m+f >= 30) {
      grade = 'D';
      if(m+f >= 50 || r >= 50) grade = 'C';
      if(m+f >= 65) grade = 'B';
      if(m+f >= 80) grade = 'A';
    }
    printf("%c\n", grade);
  }
  return 0;
}
