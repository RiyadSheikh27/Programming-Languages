for i in range(100, 1000):  
    num_str = str(i)  
    digits = [int(d) for d in num_str]  
    
    arm_num = sum(d ** 3 for d in digits)  
    
    if arm_num == i: 
        print(i)  


