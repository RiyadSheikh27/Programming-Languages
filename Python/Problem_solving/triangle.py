def check(a, b, c):
    if a + b + c == 180:
        return True
    else:
        return False


a = int(input())
b = int(input())
c = int(input())
if check(a, b, c):
    print("Yes")
else:
    print("No")
