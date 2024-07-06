import math
def calculate(H,M):
    time=(H*30)+(0.5*M)
    return time

Hour,Mnt=map(int, input("Enter Hour And Munit- ").split())
result=calculate(Hour,Mnt)

print(math.floor(result))
