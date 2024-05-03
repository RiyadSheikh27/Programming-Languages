def divisor(number):
    if number % 3 == 0 and number % 6 == 0:
        return True
    else:
        return False


number = int(input("Enter Number: "))
result = divisor(number)
print(result)
