#include <iostream>
using namespace std;

int main() {
  int h, w;
  while (cin >> h >> w, h + w != 0) {
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        printf("#");
      }
      printf("\n");
    }
    printf("\n");
  }
  return 0;
}
