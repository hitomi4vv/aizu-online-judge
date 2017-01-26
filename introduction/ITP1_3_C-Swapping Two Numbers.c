#include <stdio.h>

sort(int *a, int *b) {
  return *a - *b;
}

int main(void) {
  int arr[2];
  while(1) {
    scanf("%d %d", &arr[0], &arr[1]);
    if(arr[0] + arr[1] == 0) {
      break;
    }
    qsort(arr, 2, sizeof(int), sort);
    printf("%d %d\n", arr[0], arr[1]);
  }
  return 0;
}
