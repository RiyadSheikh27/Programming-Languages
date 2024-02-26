# class teacher:
#     def __init__(self, a, b, c):
#         self.name = a
#         self.id = b
#         self.salary = c

#     def display(self):
#         print(self.name)
#         print(self.id)
#         print(self.salary)


#     obj1=teacher("Riyad", 2027, 1000)
#     obj1.display()
class teacher:
    def __init__(self, a, b, c):
        self.name = a
        self.id = b
        self.salary = c

    def display(self):
        print(self.name)
        print(self.id)
        print(self.salary)


# Creating an instance of the teacher class outside the class definition
obj1 = teacher("Riyad", 2027, 1000)
obj1.display()
