#include <iostream>
#include <algorithm>
using namespace std;
int main() {
  string w, t;
  cin >> w;
  int c = 0;
  while (cin >> t, t != "END_OF_TEXT") {
    transform(t.begin(), t.end(), t.begin(), ::tolower);
    if(t == w) c++;
  }
  cout << c << endl;
}
