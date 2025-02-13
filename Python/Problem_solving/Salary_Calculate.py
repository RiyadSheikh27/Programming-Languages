# Write a program that will give you the in hand salary after deduction of HRA(10%),DA(5%),PF(3%), and tax(if salary is between 5-10 lakh–10%),(11-20lakh–20%),(21< _   – 30%)(0-1lakh print k).
def salary_calculate(salary):
    HRA = 0.10
    DA = 0.05
    PF = 0.03

    if 500000 <= salary <= 1000000:
        DecSalary = salary * HRA
        HandSalary = salary - DecSalary
        print(f"Salary is {HandSalary}")
    elif 1100000 <= salary <= 2000000:
        DecSalary = salary * DA
        HandSalary = salary - DecSalary
        print(f"Salary is {HandSalary}")
    elif salary >= 2100000:
        DecSalary = salary * PF
        HandSalary = salary - DecSalary
        print(f"Salary is {HandSalary}")
    elif 0 <= salary <= 100000:
        print(f"Salary is {salary}")
    else:
        print("Input Error")

IntSalary = int(input("Enter Your Salary: "))
salary_calculate(IntSalary)
