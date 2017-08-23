s = input()
n = int(input())
for _ in range(n):
  arr = input().split()
  o = arr[0]
  a = int(arr[1])
  b = int(arr[2])+1
  if o == 'print':
    print(s[a:b])
  elif o == 'reverse':
    s = s[:a]+s[a:b][::-1]+s[b:]
  elif o == 'replace':
    s = s[:a]+arr[3]+s[b:]
