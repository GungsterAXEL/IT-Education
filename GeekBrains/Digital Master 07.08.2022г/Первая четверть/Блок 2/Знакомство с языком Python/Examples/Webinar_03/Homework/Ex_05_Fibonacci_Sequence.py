'''
5. Задайте число. Составьте список чисел Фибоначчи, в том числе
для отрицательных индексов.

    *Пример:*

    - для k = 8 список будет выглядеть так:
    [-21 ,13, -8, 5, −3, 2, −1, 1, 0, 1, 1, 2, 3, 5, 8, 13, 21]
'''
from My_Functions import int_input_checker as iic, fibonacci_sequence as fs

restart = ''
while restart == '':
    user_number = iic('Введите целое число: ')

    if user_number < 0:
        user_number = -user_number
    fibo_list = fs(user_number)
    print(
        f'Последовательность чисел Фибоначчи от {-user_number} до {user_number}: ')
    print(fibo_list)

    restart = input('\nEnter - повторить.\nЧто-то другое - выход.')
    print()