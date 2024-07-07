def values(x, y, z):
    sum = x + y + z
    return sum


x, y, z = map(int, input("Enter Three Integer Number :").split())
result = values(x, y, z)
print(result)
