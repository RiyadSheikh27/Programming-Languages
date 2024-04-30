import re

pattern = r"Riyad"

match=re.search(pattern, "This is Riyad Here")

if match:
    print(match.start())
    print(match.end())
    print(match.span())


