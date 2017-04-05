#include <iostream>
#include <map>
#include <string>
using namespace std;

int main() {
  int n;
  map<string, int> cards;
  string card, suit[4] = {"S", "H", "C", "D"};
  cin >> n;
  cin.ignore();
  for(int i = 0; i < n; i++) {
    getline(cin, card);
    cards[card] = 1;
  }
  for(int i = 0; i < 4; i++) {
    for(int j = 1; j < 14; j++) {
      card = suit[i] + " " + to_string(j);
      if(!cards[card]) cout << card << endl;
    }
  }
  return 0;
}
