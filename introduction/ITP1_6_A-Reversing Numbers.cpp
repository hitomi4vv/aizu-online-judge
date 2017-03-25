#include <iostream>
using namespace std;

int main() {
  int n, i;
  cin >> n;
  int arr[n];
  for(i = n; --i >= 0;) cin >> arr[i];
  for(; ++i < n;) cout << arr[i] << (i != n-1? ' ':'\n');
  return 0;
}
