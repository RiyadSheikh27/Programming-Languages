def square(a,b,c):
    calculation = a*a+b*b+c*c
    return calculation

a,b,c= map(int, input("Enter Values of A,B,C: ").split())
result=square(a,b,c)

print(result)