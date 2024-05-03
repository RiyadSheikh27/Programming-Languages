import math
def euclidean(x1,x2,y1,y2):
    return math.sqrt((x2-x1)**2+(y2-y1)**2)

x1= int(input("Enter Value of X1 : "))
x2= int(input("Enter Value of X2 : "))
y1= int(input("Enter Value of Y1 : "))
y2= int(input("Enter Value of Y2 : "))
result = euclidean(x1,x2,y1,y2)
print(result)