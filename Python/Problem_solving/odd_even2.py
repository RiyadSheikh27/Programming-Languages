def checker(value):
    if value % 2 == 0:
        return True
    else:
        return False


odd = []
even = []
limit = int(input("Enter the range: "))
for i in range(1, limit + 1):
    if checker(i):
        odd.append(i)
else:
    even.append(i)

print(odd)
print(even)
print("Finished")
