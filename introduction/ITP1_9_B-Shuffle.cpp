#include <iostream>
using namespace std;
int main() {
  string s, t;
  int n, h;
  while(cin >> s, s != "-") {
    cin >> n;
    for(int i = 0; i < n; i++) {
      cin >> h;
      s = s.substr(h) + s.substr(0, h);
    }
    cout << s << endl;
  }
}
