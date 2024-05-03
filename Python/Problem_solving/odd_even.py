def main():
    num = int(input("Enter Number: "))
    if check(num):
        print("Its an Even Number")
    else:
        print("Its an Odd Number")


def check(num):
    if num % 2 == 0:
        return True
    else:
        return False


if __name__ == "__main__":
    main()
