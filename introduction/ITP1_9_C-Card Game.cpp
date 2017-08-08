#include <iostream>
using namespace std;
int main() {
  int t=0, h=0, n;
  string a, b;
  cin >> n;
  for(int i = 0; i < n; i++) {
    cin >> a >> b;
    if(a==b) t++, h++;
    else if(a>b) t+=3;
    else if(a<b) h+=3;
  }
  cout << t << ' ' << h << endl;
}
