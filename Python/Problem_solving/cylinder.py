from math import pi
def cylinder_volume(radius,height):
    volume = pi * radius**2 * height
    return volume

def cost(result,cost_per_ltr):
    total_cost=result * cost_per_ltr
    return total_cost

r=int(input("Enter Radius: "))
h=int(input("Enter Height: "))
result=cylinder_volume(2,10)
print(f"Cylinder volum is : {result}")

cost_per_ltr=40
total_cost = cost(result,cost_per_ltr)
print(f"Total cost is : {total_cost}")

