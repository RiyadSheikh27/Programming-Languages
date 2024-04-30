def main():
    num = int(input("Enter Number: "))
    result = check(num)
    print(result)
    if num == result:
        print("Palindrome")
    else:
        print("Not Palindrome")


def check(num):
    reverse = 0
    while num > 0:
        rev1 = num % 10
        reverse = (reverse * 10) + rev1
        num = num // 10
    return reverse


if __name__ == "__main__":
    main()
