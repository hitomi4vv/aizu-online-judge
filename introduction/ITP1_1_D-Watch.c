#include <stdio.h>

int main(void) {
  int time;
  scanf("%d", &time);
  int hour = time / 3600;
  int minutes = (time / 60) % 60;
  int seconds = time % 60;
  printf("%d:%d:%d\n", hour, minutes, seconds);
  return 0;
}
