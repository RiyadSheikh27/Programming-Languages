with open("riyad.txt",mode="r")as r_text:
    for line in r_text.readlines():
        print(line.strip(),end="")

print("finished")