while True:
  n, x = map(int, input().split())
  if n+x == 0: break
  print(sum([max(min(n, (x-i+1)//2) - max(i+1, x-i-n), 0) for i in range(1, x//3)]))
