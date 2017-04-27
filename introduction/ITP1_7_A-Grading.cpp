#include <iostream>
using namespace std;

int main() {
  int m, f, r;
  char grade;
  while(cin >> m >> f >> r, ~m || ~f || ~r) {
    grade = 'F';
    if(~m && ~f && m+f >= 30) {
      grade = 'D';
      if(m+f >= 50 || r >= 50) grade = 'C';
      if(m+f >= 65) grade = 'B';
      if(m+f >= 80) grade = 'A';
    }
    cout << grade << endl;
  }
  return 0;
}
