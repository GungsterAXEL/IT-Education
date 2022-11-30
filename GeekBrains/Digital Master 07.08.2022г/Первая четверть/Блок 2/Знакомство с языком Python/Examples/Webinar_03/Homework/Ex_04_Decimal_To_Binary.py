'''
4. Напишите программу, которая будет преобразовывать десятичное число в двоичное.

    *Пример:*

    - 45 -> 101101
    - 3 -> 11
    - 2 -> 10
'''
from My_Functions import int_input_checker as iic, decimal_to_binary_converter as dtbc

restart = ''
while restart == '':
    input_number = iic('Введите целое положительное число: ')
    if input_number > 0:
        binary_number = dtbc(input_number)
        print(f'Число {input_number} в двоичной системе счисления: {binary_number}.')
    elif input_number == 0:
        print('Ноль в любой системе ноль!')
    else:
        print('Минусы прикручивать не умею!')
    restart = input('\nEnter - повторить.\nЧто-то другое - выход.')
    print()