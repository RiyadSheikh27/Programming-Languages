
n = int(input())
stones = input()

# Initialize a variable to count the number of removals
removals = 0

# Iterate through the stones starting from the second one
for i in range(1, n):
    # If the current stone has the same color as the previous one, increment removals
    if stones[i] == stones[i - 1]:
        removals += 1

# Output the result
print(removals)
