'''
2. Напишите программу, которая найдёт произведение пар чисел списка.
Парой считаем первый и последний элемент, второй и предпоследний и т.д.

    *Пример:*

    - [2, 3, 4, 5, 6] => [12, 15, 16];
    - [2, 3, 5, 6] => [12, 15]
'''
from My_Functions import int_list_randomizer as ilr, mirrored_position_multiplier as mpm

restart = ''
while restart == '':
    random_list = ilr()
    result_list = mpm(random_list)

    print(f'Исходный список: {random_list}.')
    print(f'Результат зеркального умножения: {result_list}.')

    restart = input('\nEnter - повторить.\nЧто-то другое - выход.')
    print()