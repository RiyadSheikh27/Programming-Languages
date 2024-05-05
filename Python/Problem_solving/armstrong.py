num = int(input("Enter Number: "))
digits = [int(i) for i in str(num)]
length = len(digits)

print("Number of digits:", length)

sum = 0
for digit in digits:
    sum += digit**length

print("Sum of cubes of digits:", sum)

if num == sum:
    print("Armstrong Number")
else:
    print("Not Armstrong Number")
