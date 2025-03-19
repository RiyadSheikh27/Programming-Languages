# Print all factors of a given number provided by the user.
def factors(n):
    for i in range(1, n+1):
        if n % i == 0:
            print(i, end=" ")

n = int(input())
factors(n)