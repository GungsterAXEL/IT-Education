'''
Объявление множества.
'''
a = {1, 2, 3, 5, 8}
b = {'2', '5', 8, 13, 21}
print(type(a))  # set
print(type(b))  # set

a = {1, 2, 3, 5, 8}
b = set([2, 5, 8, 13, 21])
c = set((2, 5, 8, 13, 21))
print(type(a))  # set
print(type(b))  # set
print(type(c))  # set
a = {1, 1, 1, 1, 1}
print(a)  # {1}

'''
Добавление и удаление элементов.
'''
colors = {'red', 'green', 'blue'}
print(colors)  # {'red', 'green', 'blue'}
# При добавлении существующего элемента - множество не изменится.
colors.add('red')
print(colors)  # {'red', 'green', 'blue'}
# При добавлении нового не существующего в множестве элемента - он добавится.
colors.add('gray')
print(colors)  # {'red', 'green', 'blue','gray'}
colors.remove('red')
print(colors)  # {'green', 'blue','gray'}
# colors.remove('red') # KeyError: 'red' - Попытка удалить не существующий элемент.
colors.discard('red')  # ok - Удаление элемента без ошибки.
print(colors)  # {'green', 'blue','gray'}
colors.clear()  # { } - Очистить множество.
print(colors)  # set()

'''
Операции с множествами.
'''
a = {1, 2, 3, 5, 8}
b = {2, 5, 8, 13, 21}
# Копирование.
c = a.copy()  # c = {1, 2, 3, 5, 8}
# Объединение.
u = a.union(b)  # u = {1, 2, 3, 5, 8, 13, 21}
# Пересечение.
i = a.intersection(b)  # i = {8, 2, 5}
# Разность.
dl = a.difference(b)  # dl = {1, 3}
dr = b.difference(a)  # dr = {13, 21}

q = a \
    .union(b) \
    .difference(a.intersection(b))
# {1, 21, 3, 13}

'''
Создание неизменяемых множеств.
Добавление, удаление и т.д. работать не будут.
'''
a = {1, 2, 3, 5, 8}
b = frozenset(a)
print(b)  # frozenset({1, 2, 3, 5, 8})