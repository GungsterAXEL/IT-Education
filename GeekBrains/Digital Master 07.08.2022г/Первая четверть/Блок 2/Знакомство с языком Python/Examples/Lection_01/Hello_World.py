print("Hello, World!")
# Типы данных и переменные.
# int, float, boolean, str, list, None
value = None
a = 123
b = 1.23
print(a)
print(type(a))
print(b)
print(type(b))
value = 12334
print(value)
print(type(value))
s = "Hello, World!"
print(s)  # Вывод строки
# Последовательный вывод значений переменных через указанный разделитель.
print(a, " - ", b, " - ", s)
# Последовательный вывод значений переменных. Вместо первых фигурных скобок будет выведено значение первой переменной, указанной после слова format.
print("{} - {} - {}".format(a, b, s))
# Поменять последовательность вывода данных. {b} - {s} - {a}
print("{1} - {2} - {0}".format(a, b, s))
# Вывод значений через интерполяцию. В C# - значёк доллара перед кавычками, в Python - f.
print(f"{a} - {b} - {s}")

f = True  # Логическая переменная
print(f)

# Массивы.
# В Python как таковых массивов нет. Вместо них переменной присваиваются [].
list = [1, 2, 3]  # Данные в таких массивах лучше хранить одного типа.
col = [1, 2, 3, 4.5, True, 'Hello']
print(list)
print(col)

# Ввод и вывод данных.
#print, input
print("Введите а:")
a = int(input())  # Если нужно строковое значение, пишем просто input().
print("Введите b:")
# Если нужно целочисленное значение, то int(input()). Если вещественное - float(input())
b = int(input())
print(a, b)
print(a, '+', b, '=', a+b)
print('{} {}'.format(b, a))
print(f'{a} {b}')

# Арифметические операции.
# +, -, *, /, %, // , **
# **, ⊕, ⊖, *,/,//,%,+,-
# (), Сокращённые операции.
a = 1.2
b = 8
# Для целочисленного деления используется //.
# Для возведения в степень **.
# Для вычисления остатка от деления %.
c = round(a*b, 5)  # Округление до 5 знаков после запятой.
print(c)

# Логические операции.
# >, >=, <, <=, ==, !=
# not, and, or - не путать с &,|,^
# is, is not, in,not in
# gen
a = 'qwe'
b = 'qwe'
print(a == b)

a = 1 < 3 < 5 < 10
print(a)

func = 1
T = 4
x = 123
print(func < T > (x))

f = 1 > 2 or 4 < 6
print(f)

f = [1, 2, 3, 4]
print(not 2 in f)

is_odd = not f[0] % 2
print(is_odd)

# Управляющие конструкции.
# if, if-else.
a = int(input('a = '))
b = int(input('b = '))
if a > b:
    print(a, ' > ', b)
else:
    print(b, ' больше ', a)

username = input('Введите имя: ')
if username == 'Маша':
    print('Машка, привет!')
elif username == 'Ильнар':
    print('Ильнар - хороший препод!')
elif username == 'Марина':
    print('Люблю Маринку!')
else:
    print('Привет, ', username)

# Управляющие конструкции: while.
original = 23
inverted = 0
while original != 0:
    inverted = inverted*10+(original % 10)
    original //= 10
    print(original)
else:
    print('Пожалуй')
    print('Хватит')
print(inverted)

# For.
for i in 1, 2, 3, 4, 5:
    print(i)
    print(i**2)

list = [12, 27, 35]
for i in list:
    print(i)
else:
    print('Хорош!')

r = range(10)
for i in r:
    print(i)

for i in range(10):
    print(i+1)

for i in 'qwerty':
    print(i)

# Немного о строках.
text = 'Съешь ещё этих мягких французских булок!'
print(len(text))  # Узнать длинну строки.
print('ещё' in text)  # True. Узнать есть ли искомое в строке.
print(text.isdigit())  # False. Узнать являются ли все символы строки числами.
# False. Узнать являются ли все символы строки нижним регистром.
print(text.islower())
print(text.replace('ещё', 'ЕЩЁ'))  # Заменить слово или значение.

for c in text:
    print(c)

# Help. Справка.
help(str)

# Списки. Введение.
# list.
numbers = [1, 2, 3, 4, 5]
print(numbers)  # [1,2,3,4,5]

numbers[0] = 10
print(f'{len(numbers)} len')
print(numbers)  # [10,2,3,4,5]

for i in numbers:
    i *= 2
    print(i)  # [20,4,6,8,10]
print(numbers)  # [10,2,3,4,5]

colors = ['red', 'green', 'blue']
for e in colors:
    print(e)  # red green blue
for e in colors:
    print(e*2)  # redred greengreen blueblue

colors.append('gray')  # Добавить в конец списка.
print(colors == ['red', 'green', 'blue', 'gray'])  # True.
colors.remove('red')  # Удалить элемент.
# Удалить элемент по конкретному индексу можно и так: del colors[0]
del colors[0]

# Функции.
# def function_name(arguments):
def f(x):
    if x == 1:
        return 'Целое'
    elif x == 2.3:
        return 23
    else:
        return

arg = 2.3
print(f(arg))
print(type(f(arg)))