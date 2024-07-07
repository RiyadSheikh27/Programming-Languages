me = input().strip()  
n = 5
tag = 0

for _ in range(n):
    table = input().strip()  
    if me[0] == table[0] or me[1] == table[1]: 
        tag = 1
        break  

if tag == 1:
    print("Yes")
else:
    print("No")






