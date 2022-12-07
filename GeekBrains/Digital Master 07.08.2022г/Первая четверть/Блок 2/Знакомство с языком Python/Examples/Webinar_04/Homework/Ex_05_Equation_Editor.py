'''
5.  Даны два файла, в каждом из которых находится запись многочлена.
    Задача - сформировать файл, содержащий сумму многочленов.
    Коэффициенты могут быть как положительными, так и отрицательными.
    Степени многочленов могут отличаться.

    6 5x^6 + 2x^4 + 66
    15x^6 + 12x^5 + 33x^2 - 66

    2*x**3 + 5*x - 3

    5*x**2 - 2*x + 4

    2*x**3 + 5*x**2 + 3*x + 1
'''
eq1 = '50x**9 + 43x**7 + 3x**6 - 39x**4 - 63x**3 + 100x**2 + 82x + 101 = 0'
eq2 = '43x**8 + 85x**7 + 17x**6 + 22x**4 + 57x**3 - 11x**2 - 6x - 89 = 0'


#  Получение списка коэффициентов.
eq1 = eq1.split('=')
eq1 = eq1[0]
eq1 = eq1.split()
eqd = []
for i in range(len(eq1)):
    if eq1[i] == '-':
        eqd.append(eq1[i] + eq1[i + 1])
    elif eq1[i - 1] == '-':
        pass
    elif eq1[i] == '+':
        pass
    else:
        eqd.append(eq1[i])
print(eqd)
#
eq2 = eq2.split('=')
eq2 = eq2[0]
eq2 = eq2.split()
eqf = []
for i in range(len(eq2) - 1):
    if eq2[i] == '-':
        eqf.append(eq2[i] + eq2[i + 1])
    elif eq2[i - 1] == '-':
        pass
    elif eq2[i] == '+':
        pass
    else:
        eqf.append(eq2[i])
print(eqf)


# Формирование словаря с иксами.
eqrd = {}
for index, value in enumerate(eqd):
    if 'x**' in value:
        s = value.split('x**')
        s = f'x**{s[1]}'
        eqrd[s] = int(value[:-len(s)])
    elif 'x' in value:
        s = 'x'
        eqrd[s] = int(value[:-len(s)])
    else:
        eqrd['N'] = int(value)
print('eqrd: ', eqrd)
#
eqrf = {}
for index, value in enumerate(eqf):
    if 'x**' in value:
        s = value.split('x**')
        s = f'x**{s[1]}'
        eqrf[s] = int(value[:-len(s)])
    elif 'x' in value:
        s = 'x'
        eqrf[s] = int(value[:-len(s)])
    else:
        eqrf['N'] = int(value)
print('eqrf: ', eqrf)


# Объединение словарей.
eqrs = eqd + eqf
eqrr = {}
for key, value in eqrd.items():
    for jey, jalue in eqrf.items():
        if key == jey:
            eqrr[key] = value + jalue
        elif key not in eqrf and jey not in eqrd:
            eqrr[key] = value
            eqrr[jey] = jalue
print('eqrr: ', eqrr)


# Результатирующая строка.
result = ''
for key, value in eqrr.items():
    if key == 'N':
        result += str(value) if value < 0 else '+' + str(value)
    elif eqrr[key] > 0:
        result += '+' + str(value) + str(key)
    elif eqrr[key] < 0:
        result += str(value) + str(key)
if result[0] == '+':
    result = result.replace('+', '', 1)
result = result.replace('+', ' + ').replace('-', ' - ')
print(eq1)
print(eq2)
print(result, '= 0')