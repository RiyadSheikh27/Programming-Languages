def sum_of_numbers(*args):
    total = 0
    for num in args:
        total += num
    return total

result = sum_of_numbers(1, 2, 3, 4, 5)
print(f"Sum of numbers: {result}")
