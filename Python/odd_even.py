def odd_even(value):
    if value % 2 == 0:
        return True
    else:
        return False


starting = 0
while starting < 100:
    if odd_even(starting):
        print(f"{starting} is Even")
    else:
        print(f"{starting} is Odd")
    starting = starting + 1

    print("Finished")
