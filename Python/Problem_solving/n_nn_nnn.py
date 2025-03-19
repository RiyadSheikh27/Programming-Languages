#  a Python program that accepts an integer (n) and computes the value of n+nn+nnn.
def riyad(n):
    n_str = str(n)
    nn = int(n_str * 2)
    nnn = int(n_str * 3)
    return n + nn + nnn

num = int(input("Enter value of n: "))
print(f"n + nn + nnn: {riyad(num)}")