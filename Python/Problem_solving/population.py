# The current population of a town is 10000. The population of the town is increasing at the rate of 10% per year. You have to write a program to find out the population at the end of each of the last 10 years. For eg current population is 10000 so the output should be like this:
# 1.	10th year - 10000
# 2.	9th year - 9090
# 3.	8th year - 8264 and so on
def population(n,r):
    cur_pop =  n
    rate = (r/100)+1
    for i in range(r,0,-1):
        print(f"{i}th year - {int(cur_pop)}")
        cur_pop = cur_pop / rate

population(10000,10)
