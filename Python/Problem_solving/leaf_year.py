def check(year):
    if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
        return True
    else:
        return False

year = int(input("Enter Year: "))
if check(year):
    print("Leap Year")
else:
    print("Not a Leap Year")
