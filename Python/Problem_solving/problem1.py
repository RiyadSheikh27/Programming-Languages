x,y,z = map(int, input("Enter Three Integer Number :").split())
if x>y and x>z:
    print("X is biggest")
elif y>x and y>z:
    print("Y is biggest")
else:
    print("Z is biggest")
