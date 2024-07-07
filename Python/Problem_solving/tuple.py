def get_elements(tuplex):
    if len(tuplex) >= 4:
        fourth_from_beginning = tuplex[3]
        fourth_from_end = tuplex[-4]
        return fourth_from_beginning, fourth_from_end
    else:
        return "Tuple is too short"

tuplex = ("w", 3, "r", "e", "s", "o", "u", "r", "c", "e")

fourth_from_beginning, fourth_from_end = get_elements(tuplex)

print(fourth_from_beginning, fourth_from_end)
