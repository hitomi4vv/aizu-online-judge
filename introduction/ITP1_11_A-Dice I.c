#include <stdio.h>

typedef struct Dice {
  int label[6];
} Dice;
void roll(struct Dice dice);

int main() {
  Dice dice;
  int i;
  for(i=0; i<6; i++) scanf("%d", &dice.label[i]);
  roll(dice);
  return 0;
}

void roll(struct Dice dice) {
  int i;
  for(i=0; i<6; i++) printf("%d ", dice.label[i]);
}
