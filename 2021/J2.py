values = []
max = ["", 0]

for i in range(int(input())):
    values.append([input(), int(input())])
for value in values:
    if value[1] > max[1]:
        max = value

print(max[0])
