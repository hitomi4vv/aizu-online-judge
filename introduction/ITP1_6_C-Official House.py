n = int(input())
arr = [[[0 for _ in range(10)] for _ in range(3)] for _ in range(4)]
for _ in range(n):
  b, f, r, v = map(int, input().split())
  arr[b-1][f-1][r-1] += v
for b in range(4):
  if b > 0: print('#' * 20)
  for f in range(3): print('', ' '.join(map(str, arr[b][f])))
