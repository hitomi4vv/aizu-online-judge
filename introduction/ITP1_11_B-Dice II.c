#include <stdio.h>

typedef struct Dice {
  int labels[6];
  int patterns[24][6];
} Dice;
void init(struct Dice *dice) {
  int i;
  for(i=0; i<7; i++) {
    roll(&dice, i<4?'N':'W');
    if(i==5) continue;
    // dice->patterns[j][0][0] = l[0];
    // dice->patterns[j][0][1] = l[1];
    // dice->patterns[j][0][2] = l[2];
    // dice->patterns[j][0][3] = l[3];
    // dice->patterns[j][0][4] = l[4];
    // dice->patterns[j][0][5] = l[5];
    // dice->patterns[j][1] = {l[0], l[2], l[4], l[1], l[3], l[5]};
    // dice->patterns[j][2] = {l[0], l[4], l[3], l[2], l[1], l[5]};
    // dice->patterns[j][3] = {l[0], l[3], l[1], l[4], l[2], l[5]};
    // j++;
  }
}
void roll(struct Dice *dice, char dir) {
  int n[6], l[6], i;
  for(i=0; i<6; i++) l[i] = dice->labels[i];
  switch(dir) {
    case 'N':
      dice->labels[0] = l[1];
      dice->labels[1] = l[5];
      dice->labels[2] = l[2];
      dice->labels[3] = l[3];
      dice->labels[4] = l[0];
      dice->labels[5] = l[4];
      break;
    case 'S':
      dice->labels[0] = l[4];
      dice->labels[1] = l[0];
      dice->labels[2] = l[2];
      dice->labels[3] = l[3];
      dice->labels[4] = l[5];
      dice->labels[5] = l[1];
      break;
    case 'E':
      dice->labels[0] = l[3];
      dice->labels[1] = l[1];
      dice->labels[2] = l[0];
      dice->labels[3] = l[5];
      dice->labels[4] = l[4];
      dice->labels[5] = l[2];
      break;
    case 'W':
      dice->labels[0] = l[2];
      dice->labels[1] = l[1];
      dice->labels[2] = l[5];
      dice->labels[3] = l[0];
      dice->labels[4] = l[4];
      dice->labels[5] = l[3];
      break;
  }
}

int main() {
  Dice dice;
  int i, n, t, f;
  for(i=0; i<6; i++) scanf("%d", &dice.labels[i]);
  init(&dice);
  scanf("%d", &n);
  for(i=0; i<n; i++) {
    scanf("%d %d", &t, &f);
    printf("%d %d\n", t, f);
  }
  return 0;
}
