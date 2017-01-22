while True:
  a, b = map(int, input().split())
  if a is b is 0:
    break;
  print(min(a, b), max(a, b))
