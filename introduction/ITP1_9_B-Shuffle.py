for s in iter(input, "-"):
 for i in range(int(input())):
   h = int(input())
   s = s[h:]+s[:h]
 print(s)
