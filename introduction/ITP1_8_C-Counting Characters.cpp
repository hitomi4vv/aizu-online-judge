#include <iostream>
using namespace std;
int main() {
  string line;
  int s[256] = {};
  while(cin >> line) for(char c:line) s[tolower(c)]++;
  for(char c = 'a'; c <= 'z'; c++) cout << c << " : " << s[c] << endl;
}
