from itertools import permutations

numbers = [1, 2, 3, 4]
unique_combinations = permutations(numbers)

for combination in unique_combinations:
    print(combination)
