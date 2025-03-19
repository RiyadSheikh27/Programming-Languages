# Least Common Multiple
import math

def lcm(a, b):
    return abs(a*b) // math.gcd(a, b)

a, b = map(int, input("Enter two numbers for LCM by space: ").split())
print(f"LCM of {a} & {b} is : {lcm(a, b)}")