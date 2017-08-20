#include <bits/stdc++.h>
using namespace std;
int main() {
  int n, a, b;
  string s, o, p;
  cin >> s >> n;
  for(int i=0; i<n; i++) {
    cin >> o >> a >> b;
    b++;
    if(o == "print") cout << s.substr(a, b-a) << endl;
    if(o == "reverse") reverse(s.begin()+a, s.begin()+b);
    if(o == "replace") {
      cin >> p;
      s.replace(a, b-a, p);
    }
  }
}
