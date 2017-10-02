n = input()
x = map(int, input().split())
y = map(int, input().split())
xy = [abs(xi - yi) for xi, yi in zip(x, y)]
for p in range(1, 4):
  print(sum(i ** p for i in xy) ** (1 / p))
print(max(xy))
