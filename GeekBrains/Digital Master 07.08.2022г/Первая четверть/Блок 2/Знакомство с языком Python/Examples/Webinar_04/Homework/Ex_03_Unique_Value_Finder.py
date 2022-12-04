'''
3.  Задайте последовательность чисел.
    Напишите программу, которая выведет список неповторяющихся элементов исходной последовательности.

    *Пример*

    - при [1, 1, 2, 3, 3, 4, 1, 5, 7, 8, 8, 7, 9]     ->        [2, 4, 5, 9]
'''
from Hw_Methods import int_list_randomizer as ilr, unique_value_finder as uvs

restart = ''
while restart == '':
    random_list = ilr()
    unique_list = uvs(random_list)
    
    print(f'Сгенерированный список:  {random_list}.')
    print(f'Его уникальные элементы: {unique_list}.')

    restart = input('\nПовторить - Enter.\nЧто-то другое - выход.')
    print()