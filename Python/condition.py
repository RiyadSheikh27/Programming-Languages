marks = int(input("Whats your mark: "))

def result(grade):
    print(f"Your result is {grade}")



if marks>80:
    result("A+")
elif marks<80 and marks>70:
    result("A")
else:
    result("You are fail")    
    
     
    