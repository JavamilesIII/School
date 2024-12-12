import random
numbers = []
additional = [random.randint(1, 6)]
while len(numbers) < 6:
    x = random.randint(1, 49)
    if x in numbers:
        continue
    else:
        numbers.append(x)
        numbers.sort()
print(*numbers, additional , sep=' ')