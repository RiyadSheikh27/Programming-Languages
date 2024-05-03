def main():
    cost = int(input("Enter cost price: "))
    sell = int(input("Enter Sell price: "))
    if check(cost,sell):
        print("Profit")
    else:
        print("Lose")

def check(cost,sell):
    if cost<sell:
        return True
    else:
        return False

if __name__ == "__main__":
    main()