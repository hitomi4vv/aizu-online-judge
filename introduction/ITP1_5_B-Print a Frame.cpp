#include <iostream>
using namespace std;

int main() {
  int h, w;
  while (cin >> h >> w, h + w != 0) {
    for(int i = 0; i < h; i++) {
      cout << '#';
      for(int j = 0; j < w-2; j++) cout << ((i && h-i-1)? '.':'#');
      cout << '#' << endl;
    }
    cout << endl;
  }
  return 0;
}
