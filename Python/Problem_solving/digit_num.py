# Take a number from the user and find the number of digits in it. 
def digit(n):
    num_dig = len(str(abs(n)))
    return num_dig

num = int(input("Enter Numbers: "))
print(f"Digits of {num} is : {digit(num)}")