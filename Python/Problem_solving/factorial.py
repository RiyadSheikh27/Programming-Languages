def fact(n):
    mul = 1
    for i in range(n, 1, -1):
        mul *= i
    print(f"Factorial of n is {mul}")

n = int(input("Enter the value of n: "))
fact(n)