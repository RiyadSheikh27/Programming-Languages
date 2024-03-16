from abc import ABC, abstractmethod


class main(ABC):
    def __init__(self, A, B):
        self.value1 = A
        self.value2 = B

    @abstractmethod
    def abs(self):
        pass


class sum(main):
    def abs(self):
        sumation = self.value1 + self.value2
        print(sumation)


class sub(main):
    def abs(self):
        substraction = self.value1 - self.value2
        print(substraction)


obj1 = sub(20, 10)
obj1.abs()

obj2 = sum(10, 20)
obj2.abs()
