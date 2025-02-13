def mul(a, b):
    result = 0
    for i in range(a):
        result+= b
    print(f"Result is {result}") 

a,b = map(int, input("Enter value of a and b: ").split())
mul(a, b)