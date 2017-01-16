#include <iostream>
using namespace std;

int main(void) {
  int time;
  cin >> time;
  int hour = time / 3600;
  int minutes = (time / 60) % 60;
  int seconds = time % 60;
  cout << hour << ':' << minutes << ':' << seconds << endl;
  return 0;
}
