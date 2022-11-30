'''
3. Задайте список из вещественных чисел.
Напишите программу, которая найдёт разницу между максимальным и
минимальным значением дробной части элементов.

    *Пример:*
    - [1.1, 1.2, 3.1, 5, 10.01] => 0.19
'''
from My_Functions import float_list_randomizer as flr, min_max_dot_finder as mmdf

restart = ''
while restart == '':
    random_list = flr()
    min_max_dot_value = mmdf(random_list)
    min_max_difference = min_max_dot_value[1] - min_max_dot_value[0]
    print(f'Список: {random_list}.')
    print(
        f'Его минимальное {min_max_dot_value[0]} и максимальное {min_max_dot_value[1]} значения после запятой.')
    print(f'Разница между ними равна {min_max_difference}.')

    restart = input('\nEnter - повторить.\nЧто-то другое - выход.')
    print()