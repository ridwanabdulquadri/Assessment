sum = 0

for i in range(1, 31):
    if i % 3 == 0:
        sum += i

print(f"The sum of integers divisible by 3 is {sum}")