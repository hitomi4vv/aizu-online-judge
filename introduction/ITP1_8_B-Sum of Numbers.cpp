#include <iostream>
using namespace std;
int main() {
  string line;
  while (cin >> line, line != "0") {
    int sum = 0;
    for(char c:line) sum += c - '0';
    cout << sum << endl;
  }
}
