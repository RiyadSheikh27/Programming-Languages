def sum_of_n(n):
    sum = 0
    for i in range(n+1):
        sum = sum+i
    print(f"Result is : {sum}")

n = int(input("Enter the value of n: "))
sum_of_n(n)