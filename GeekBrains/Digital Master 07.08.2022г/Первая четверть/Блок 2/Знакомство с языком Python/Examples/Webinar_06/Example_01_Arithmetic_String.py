'''
1.  Напишите программу вычисления арифметического выражения заданного строкой.
    Используйте операции +,-,/,*. приоритет операций стандартный.
    *Пример:*
    2+2 => 4;
    7-8+3*5+1+1+2*3 => 22;

    a = '7-82+3*5+13+1+25*3'

    b = ['7', '-', '82', '+', '3', '*', '5',
    '+', '13', '+', '1', '+', '25', '*', '3']

    7, -8, 15, 1, 1, 6
    1-2*3 => -5;
'''

operations = {
    '+': lambda x, y: x + y,
    '-': lambda x, y: x - y,
    '*': lambda x, y: x * y,
    '/': lambda x, y: x / y
    }

a = '7-82+3*5+13+1+25*3*2'
a = a.replace('*', ' * ').replace('/', ' / ').replace('+', ' + ').replace('-', ' -').split()

print(a)

result = 0
for i in range(len(a) - 1):
    if a[i] == '*':
        result = operations.get('*')(int(a[i - 1]), int(a[i + 1]))
        print(result)

print(* a)