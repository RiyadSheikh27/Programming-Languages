def swap_num(a, b):
    print(f"Before swapping, a= {a}, b= {b}")   
    a, b =b, a
    print(f"After swapping, a= {a}, b= {b}")

a,b = map(int, input("Enter two Integer Number :").split())
swap_num(a, b)
