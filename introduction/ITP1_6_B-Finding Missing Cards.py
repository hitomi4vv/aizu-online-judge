cards = [suit + ' ' + str(i) for suit in ['S', 'H', 'C', 'D'] for i in range(1, 14)]
for i in range(int(input())): cards.remove(input())
if len(cards) > 0: print('\n'.join(cards))
