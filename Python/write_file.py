with open("riyad.txt",mode="r")as r_text:
        all_word = []
        for line in r_text.readlines():
          word = line.strip().split(" ")
        all_word += word
        print(len(all_word))
        unique_word = set(all_word)
        print(len(unique_word))

with open("unique_word.txt",mode="w") as w_text:
    for items in unique_word:
        w_text.write(item)
        

        
