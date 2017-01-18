#include <stdio.h>

sort(int *a, int *b) {
  return *a - *b;
}

int main(void) {
  int arr[3];
  scanf("%d %d %d", &arr[0], &arr[1], &arr[2]);
  qsort(arr, 3, 4, sort);
  printf("%d %d %d\n", arr[0], arr[1], arr[2]);
  return 0;
}
