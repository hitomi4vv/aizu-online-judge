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
  int n[6], l[6], i;
  for(i=0; i<6; i++) l[i] = dice.labels[i];
  switch(dir) {
    case 'N':
      dice.labels[0] = l[1];
      dice.labels[1] = l[5];
      dice.labels[2] = l[2];
      dice.labels[3] = l[3];
      dice.labels[4] = l[0];
      dice.labels[5] = l[4];
      break;
    case 'S':
      dice.labels[0] = l[4];
      dice.labels[1] = l[0];
      dice.labels[2] = l[2];
      dice.labels[3] = l[3];
      dice.labels[4] = l[5];
      dice.labels[5] = l[1];
      break;
    case 'E':
      dice.labels[0] = l[3];
      dice.labels[1] = l[1];
      dice.labels[2] = l[0];
      dice.labels[3] = l[5];
      dice.labels[4] = l[4];
      dice.labels[5] = l[2];
      break;
    case 'W':
      dice.labels[0] = l[2];
      dice.labels[1] = l[1];
      dice.labels[2] = l[5];
      dice.labels[3] = l[0];
      dice.labels[4] = l[4];
      dice.labels[5] = l[3];
      break;
  }
}
