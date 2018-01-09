#include <stdio.h>

typedef struct Dice {
  int labels[6];
} Dice;
void roll(struct Dice dice, char dir);

int main() {
  Dice dice;
  int i;
  char dirs[101];
  for(i=0; i<6; i++) scanf("%d", &dice.labels[i]);
  scanf("%s", dirs);
  for(i=0; i<strlen(dirs); i++) roll(dice, dirs[i]);
  printf("%d", dice.labels[0]);
  return 0;
}

void roll(struct Dice dice, char dir) {
  printf("%c ", dir);
}
