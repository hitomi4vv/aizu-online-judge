int main() {
  char line[1001];
  int sum, i;
  while(1) {
    scanf("%s", &line);
    if(line[0] == '0') break;
    sum = 0;
    for(i = 0; line[i]; i++) sum += line[i] - '0';
    printf("%d\n", sum);
  }
  return 0;
}
