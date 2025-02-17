def prime(n):
    if n < 2:
        print(f"{n} is not a prime number")
        return
    else:
        for i in range(2, int(n**0.5) + 1):
            if n % i == 0:
                print(f"{n} is not a prime number")
                return
        print(f"{n} is a prime number")

prime(53)
prime(37)
prime(25)
prime(49)