a, b, c = map(int, input().split())
count = 0
for num in range(a, b+1):
    if c % num is 0:
      count += 1;
print(count)
