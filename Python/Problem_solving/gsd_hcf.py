import math


def HCF(a, b):
    return math.gcd(a, b)


a, b = map(int, input("Enter two numbers by space: ").split())
print("GCD/HCF: ", HCF(a, b))
