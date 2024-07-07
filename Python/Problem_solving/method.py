class student:
    roll = ""
    gpa = ""

    def get_inp(self, sroll, sgpa):
        self.roll = sroll
        self.name = sgpa

    def display(self):
        print(f"Roll : {self.roll} and Gpa : {self.gpa}")


obj1 = student()
obj1.get_inp(101, 3.5)
obj1.display()
