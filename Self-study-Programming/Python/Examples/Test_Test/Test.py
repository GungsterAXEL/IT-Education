import random


def sale_hotdogs(n):
    return n * (100 if n < 5 else 95 if n < 10 else 90)


price = sale_hotdogs(10)
print(price)