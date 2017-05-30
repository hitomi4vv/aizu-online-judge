n, m, l = map(int, input().split())
a = [list(map(int,input().split())) for _ in range(n)]
b = [list(map(int,input().split())) for _ in range(m)]
[print(*i) for i in [[sum(j*k for j, k in zip(i, v)) for v in zip(*b)] for i in a]]
