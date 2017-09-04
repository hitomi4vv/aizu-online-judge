import math
a, b, c = map(int, input().split())
c = math.radians(c)
h = b*math.sin(c)
print(a*h*.5)
print(a+b+math.sqrt(a*a+b*b-2*a*b*math.cos(c)))
print(h)
