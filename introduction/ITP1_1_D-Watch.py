time = int(input())
hour = time // 3600;
minutes = (time // 60) % 60;
seconds = time % 60;
print(hour, minutes, seconds, sep=':')
