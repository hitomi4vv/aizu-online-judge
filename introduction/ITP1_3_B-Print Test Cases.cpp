#include <iostream>
using namespace std;

int main(void) {
  int count = 1, line;
  cin >> line;
  while (line != 0) {
    cout << "Case " << count << ": " << line << endl;
    cin >> line;
    ++count;
  }
  return 0;
}
