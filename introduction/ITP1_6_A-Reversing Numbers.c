#include <stdio.h>

int main() {
  int n, i;
  scanf("%d", &n);
  int arr[n];
  for(i = n; --i >= 0;) scanf("%d", &arr[i]);
  for(; ++i < n;) printf("%d%c", arr[i], i != n-1? ' ':'\n');
  return 0;
}
