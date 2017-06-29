import sys
s = sys.stdin.read().lower()
for c in range(97, 123): print(chr(c), ':', s.count(chr(c)))
