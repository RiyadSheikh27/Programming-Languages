def reverse_number(number):
  if number < 1000 or number > 9999:
    return None, False 

  reversed_number = 0
  original_number = number

  while number > 0:
    digit = number % 10
    reversed_number = reversed_number * 10 + digit
    number //= 10

  return reversed_number, reversed_number == original_number

number = int(input("Enter Number: "))
reversed_num, is_palindrome = reverse_number(number)

if reversed_num is not None:
  print(f"The reverse of {number} is {reversed_num}.")
  if is_palindrome:
    print(f"{number} is a palindrome.")
  else:
    print(f"{number} is not a palindrome.")
else:
  print(f"{number} is not a four-digit number.")