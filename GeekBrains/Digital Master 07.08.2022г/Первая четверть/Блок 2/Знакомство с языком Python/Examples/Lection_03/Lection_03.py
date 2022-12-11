# Lambda.
sum = lambda x: x+10
sum1 = lambda x: x+22
sum4 = lambda x: x+242
mult = lambda x: x**2
mult2 = lambda x: x**3
mult4 = lambda x: x**5

def h(f, g, x): return f(g(x)) # Тоже, что и на 10 строке.
h = lambda f, g, x: f(g(x)) # Тоже, что и на 9 строке.
h(sum, mult, 5)
print(h(lambda x: x+10, lambda x: x**2, 5))

# List Comprehension.
n = [1, 2, 3, 5, 8, 15, 23, 38]
s = [(i, i**4) for i in n if i % 2 == 0]
print(n, '\n', s)

# Анонимные Lambda функции.
def select(f, col):
 return [f(x) for x in col]
def where(f, col):
 return [x for x in col if f(x)]
data = '1 2 3 5 8 15 23 38'.split()
data = select(int, data)
data = where(lambda e: not e % 2, data)
data = list(select(lambda e: (e, e**2), data))

data = '1 2 3 5 8 15 23 38'.split()
data = list(map(int, data))
data = list(filter(lambda e: not e % 2, data))
data = list(map(lambda e: (e, e**2), data))
print(data)

# Map.
data = list(map(int, input().split()))

# Filter.
data = [x for x in range(10)]
res = list(filter(lambda x: x % 2 == 0, data))
print(res)

# Zip.
users = ['user1', 'user2', 'user3', 'user4', 'user5']
ids = [4, 5, 9, 14, 7]
data = list(zip(users, ids))
print(data)