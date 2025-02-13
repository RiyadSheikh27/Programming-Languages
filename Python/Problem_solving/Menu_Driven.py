def cm_to_ft(cm):
    return cm / 30.48

def kl_to_miles(kl):
    return kl / 1.609

def usd_to_tk(usd):
    return usd * 130

def main():
    while True:
        print("1. Cm to Ft")
        print("2. Kl to Miles")
        print("3. Usd to Tk")
        print("4. Exit")

        choice = int(input("Enter Choice: "))

        if choice == 1:
            cm = float(input("Enter cm: "))
            ft = cm_to_ft(cm)
            print(f"{cm} cm is equal to {ft:.2f} feet.")
        elif choice == 2:
            kl = float(input("Enter kl: "))
            miles = kl_to_miles(kl)
            print(f"{kl} km is equal to {miles:.2f} miles.")
        elif choice == 3:
            usd = float(input("Enter USD: "))
            tk = usd_to_tk(usd)
            print(f"${usd} USD is equal to ৳{tk:.2f} Tk.")
        elif choice == 4:
            print("Program End")
            break
        else:
            print("Invalid choice. Please try again.")

if __name__ == "__main__":
    main()

        
