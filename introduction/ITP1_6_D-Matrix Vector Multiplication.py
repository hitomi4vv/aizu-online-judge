n, m = map(int, input().split())
a = [map(int, input().split()) for _ in range(n)]
b = [int(input()) for _ in range(m)]
[print(sum([j*k for j, k in zip(a[i], b)])) for i in range(n)]
