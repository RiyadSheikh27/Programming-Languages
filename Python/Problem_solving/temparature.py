def temparature(temp,hum):
    if temp>=30 and hum>=90:
        return "Hot and Humid"
    elif temp>=30 and hum<90:
        return "Hot"
    elif temp<30 and hum>=90:
        return "Cool and Humid"
    elif temp<30 and hum<90:
        return "Cool"
    else:
        return"Invalid"
        
Temparature,Hunidity=map(int, input("Enter Input : ").split())
result = temparature(Temparature,Hunidity)

print(result)