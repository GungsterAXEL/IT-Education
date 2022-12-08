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

a = '7-82+3*5+13+1+25*3'
a_list = []
for i in range(len(a)):
    a_list.append(a[i])
print(a_list)

s_list = []
for i in range(len(a_list) - 1):
    if a_list[i].isdigit() and a_list[i + 1].isdigit():
        s_list.append(a_list[i] + a_list[i + 1])
        a_list.remove(a_list[i + 1])
    else:
        s_list.append(a_list[i])
print(s_list)

