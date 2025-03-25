def reverse_number(num):
    reversed_num = 0
    is_negative = num < 0
    num = abs(num)

    while num > 0:
        digit = num % 10
        reversed_num = reversed_num * 10 + digit
        num = num // 10

    return -reversed_num if is_negative else reversed_num


try:
    number = int(input("Enter a number to reverse: "))
    print(f"The reversed number is: {reverse_number(number)}")
except ValueError:
    print("Please enter a valid integer.")
