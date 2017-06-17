#include <iostream>
#include <string.h>
using namespace std;
int main() {
  char line[1200];
  cin.getline(line, sizeof(line));
  for(int i = 0; i < strlen(line); ++i) {
    char c = line[i];
    if(isupper(c)) c = tolower(c); else c = toupper(c);
    cout << c;
  }
  cout << endl;
  return 0;
}
