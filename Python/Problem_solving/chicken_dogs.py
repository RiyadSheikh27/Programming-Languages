def count(heads, legs):
    for chickens in range(heads + 1):
        dogs = heads - chickens
        if (chickens * 2 + dogs * 4) == legs:
            if chickens + dogs == heads:
                return chickens, dogs
    return None 

total_heads = int(input("Enter the total number of heads: "))
total_legs = int(input("Enter the total number of legs: "))

result = count(total_heads, total_legs)
if result:
    chickens, dogs = result
    print(f"Number of chickens: {chickens}")
    print(f"Number of dogs: {dogs}")
else:
    print("No valid solution found. Please check the input values.")
