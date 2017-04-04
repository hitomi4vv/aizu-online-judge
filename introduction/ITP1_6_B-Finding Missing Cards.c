int main() {
  int n, i, j, d, cards[4][13] = {0};
  char s, suit[4] = "SHCD";
  scanf("%d\n", &n);
  for(i = 0; i < n; cards[s][d] = 1, i++)
    scanf("%c %d\n", &s, &d);
  for(i = 0; i < 4; i++)
    for(j = 1; j < 14; j++)
      if(!cards[suit[i]][j]) printf("%c %d\n", suit[i], j);
  return 0;
}
