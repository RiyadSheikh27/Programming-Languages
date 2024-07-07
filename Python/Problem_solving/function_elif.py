def show_grade(grade):
    print(f"Your Grade is {grade}")


mark = int(input("Your Number : "))

if mark >= 80:
    show_grade("A+")
elif 70 <= mark < 80:  # Fixed the condition and typo in variable name
    show_grade("A")
else:
    show_grade("Fail")

print("Finished")
