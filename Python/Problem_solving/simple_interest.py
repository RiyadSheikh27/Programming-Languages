def interest_count(a,b,c):
    interest = (a * b * c)/100
    return interest

p=int(input("Enter Principle: "))
r=int(input("Enter Rate: "))
t=int(input("Enter Time: "))
result=interest_count(p,r,t)

print(result)