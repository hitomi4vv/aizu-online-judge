r, c = map(int, input().split())
arr = r*[0]
for i in range(r):
  arr[i] = list(map(int, input().split()))
  arr[i].append(sum(arr[i]))
  print(*arr[i])
print(*list(map(sum, zip(*arr))))
