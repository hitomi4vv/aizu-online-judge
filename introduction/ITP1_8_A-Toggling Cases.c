int main() {
  char c;
  while(~(c = getchar())) putchar(islower(c)? toupper(c):tolower(c));
  return 0;
}
