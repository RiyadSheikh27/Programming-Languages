k, n, w = map(int, input().split())

total_cost = k * (w * (w + 1) // 2)

borrowed_money = max(0, total_cost - n)

print(borrowed_money)
