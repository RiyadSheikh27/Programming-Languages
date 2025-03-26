count = 0
total = 0

while True:
    num = int(input("Enter Numbers(0 to Stop): "))
    if num == 0:
        break
    else:
      count += 1
      total += num

average = total / count
print(average)