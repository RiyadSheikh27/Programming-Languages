# class teacher:
#     def __init__(self, a, b, c):
#         self.name = a
#         self.id = b
#         self.salary = c

#     def display(self):
#         print(self.name)
#         print(self.id)
#         print(self.salary)


# obj1 = teacher("Riyad", 2027, 1000)
# obj1.display()


# Area of a Triangle
class Triangle:
    def __init__(self, tbase, theight):
        self.base = tbase
        self.height = theight

    def ans(self):
        area = 0.5 * self.base * self.height
        print("Area = ", area)


obj1 = Triangle(10, 20)
obj1.ans()
obj2 = Triangle(15, 20)
obj2.ans()
