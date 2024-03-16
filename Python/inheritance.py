class student:
    def secA(self):
        print("I am student of section A")

    def secB(self):
        print("I am student of section B")


class teacher(student):
    def course1(self):
        print("I am teacher of course one")

    def course2(self):
        print("I am teacher of course two")


obj1 = teacher()
obj1.course1()
obj1.secA()
print(issubclass(teacher, student))
