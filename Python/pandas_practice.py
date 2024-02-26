# import pandas as pd

# student = [
#     (1, "Riyad", "22", "Chandpur"),
#     (2, "Akash", "23", "Khulna"),
#     (3, "Roshni", "21", "Dhaka"),
# ]

# df = pd.DataFrame(student, columns=["Serial", "Name", "Age", "Town"])
# df


import pandas as pd

student = [
    (1, "Riyad", "22", "Chandpur"),
    (2, "Akash", "23", "Khulna"),
    (3, "Roshni", "21", "Dhaka"),
]

df = pd.DataFrame(student, columns=["Serial", "Name", "Age", "Town"])
print(df)  # Add this line to display the DataFrame in the terminal
