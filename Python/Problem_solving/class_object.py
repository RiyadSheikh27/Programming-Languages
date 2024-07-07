class teacher:
    def inp(self):
        self.id = int(input("Enter Id: "))
        self.name = input("Enter Name: ")

    def out(self):
        print(self.id)
        print(self.name)

obj = teacher()
obj.inp()
obj.out()

