class student:
    roll = ""
    name = ""


obj1 = student()
print(isinstance(obj1, student))
obj1.roll = 213
obj1.name = "Riyad"
print(f"My name is {obj1.name} and my roll is {obj1.roll}")
