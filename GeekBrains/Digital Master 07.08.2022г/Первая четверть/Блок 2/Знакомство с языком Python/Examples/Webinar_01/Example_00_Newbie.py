a = 123
print(type(a), a)

a = '123'
print(type(a), a)

a = 12
b = 55
print(f'{a} + {b}^2 % 3 = ', a+b**2 % 3)

# Тройные " или тройные ' - позволяют сохранить перенос строк.
a = """2
5
3"""
print(a)

# if, elif, else
a = str()
if a:
    print(123)
else:
    print(222)

print(dir('22'))  # Функция dir.
# Позволяет посмотрять какие методы есть у объекта.
# Использовать можно все без нижнего подчёркивания.

# while
cnt = 0
while cnt < 5:
    print("Hello!")
    cnt += 1

cnt=0
for cnt in range(5):
    print("Hello!")