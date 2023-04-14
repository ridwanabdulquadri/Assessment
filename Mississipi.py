s = "Mississippi"
each_s = 0
each_i = 0

for k in s:
    if k == 's':
        each_s += 1
    elif k == 'i':
        each_i += 1

print(f"Number of 's': {each_s}")
print(f"Number of 'i': {each_i}")