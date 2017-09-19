from statistics import pstdev
for n in iter(input, "0"):
  print(pstdev(map(int, input().split())))
