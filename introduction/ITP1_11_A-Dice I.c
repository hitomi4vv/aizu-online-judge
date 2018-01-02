#include <stdio.h>

typedef struct Dice {
  int label[6];
} Dice;

int main() {
  Dice dice;
  int i;
  for(i=0; i<6; i++) scanf("%d", &dice.label[i]);
  return 0;
}
