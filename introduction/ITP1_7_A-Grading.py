while True:
  m, f, r = map(int, input().split())
  if m+f+r == -3: break
  grade = 'F'
  if m != -1 and f != -1 and m+f >= 30:
    grade = 'D';
    if m+f >= 50 or r >= 50: grade = 'C'
    if m+f >= 65: grade = 'B'
    if m+f >= 80: grade = 'A'
  print(grade)
