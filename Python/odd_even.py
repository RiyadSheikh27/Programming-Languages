def odd_even(value):
    if value % 2 == 0:
        return True
    else:
        return False

odd= []
even = []
starting = 0
limit = int(input("Limit: "))
for i in range(0, limit):
    if odd_even(starting):
        even.append(starting)
    else:
        odd.append(starting)
    starting = starting + 1

print(f"Odd Numbers are: {odd}")
print(f"Even Numbers are: {even}")