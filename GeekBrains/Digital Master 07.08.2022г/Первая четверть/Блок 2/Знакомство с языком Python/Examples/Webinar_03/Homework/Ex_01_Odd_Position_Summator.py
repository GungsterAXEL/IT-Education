'''
1. Задайте список из нескольких чисел. Напишите программу,
   которая найдёт сумму элементов списка, стоящих на нечётной позиции.

    *Пример:*

    - [2, 3, 5, 9, 3] -> на нечётных позициях элементы 3 и 9, ответ: 12
'''
from My_Functions import int_list_randomizer as ilr, odd_position_summator as ops

restart = ''
while restart == '':
    random_list = ilr()

    if len(random_list) <= 1:
        print(f'{random_list}\n-> Нет нечётных позиций. =(')
    else:
        odd_position_result = ops(random_list)
        print(f'{random_list}')
        print(
            f'-> на нечётных позициях находятся элементы {odd_position_result[0]}')
        print(f'-> их сумма равна {odd_position_result[1]}.')

    restart = input('\nEnter - заново.\nЧто-то другое - выход.')
    print()