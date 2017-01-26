#include <iostream>
#include <algorithm>
using namespace std;

int main(void) {
  int arr[2];
  while (cin >> arr[0] >> arr[1], arr[0] || arr[1]) {
    sort(arr, arr + 2);
    cout << arr[0] << ' ' << arr[1] << endl;
  }
  return 0;
}
