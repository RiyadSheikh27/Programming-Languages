class A:
    def display1(self):
       print("I am Inside A class")

class B:
    def display2(self):
       print("I am Inside B class")

class C(A,B):
    def display3(self):
    #    super().display1
    #    super().display2
       print("I am Inside C class")
    
obj1 = C()
obj1.display3()
obj1.display2()
obj1.display1()