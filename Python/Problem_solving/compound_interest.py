# চক্রবৃদ্ধি সুদ
# A = P(1+r/n)**no
# C = P - A
def compound_interest(principal, rate, time, n):
    amount = principal * (1 + rate / n) ** (n * time)
    ci = amount - principal
    return ci

P = float(input("Enter the principal amount: "))
r = float(input("Enter the annual interest rate (in percentage): ")) / 100
t = float(input("Enter the time in years: "))
n = int(input("Enter the number of times the interest is compounded per year: "))

CI = compound_interest(P, r, t, n)
print(f"The compound interest is: {CI:.2f}")