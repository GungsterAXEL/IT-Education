'''
2.  Задайте натуральное число N.
    Напишите программу, которая составит список простых множителей числа N.

    *Пример*

    - при N=236     ->        [2, 2, 59]
'''
from Hw_Methods import float_input_checker as fic, prime_factors_finder as pff

restart = ''
while restart == '':
    n = int(fic('Введите число для поиска простых множителей: '))
    n_factors_list = pff(n)

    print(f'Простые множители для числа {n}: {n_factors_list}.')

    restart = input('\nПовторить - Enter.\nЧто-то другое - выход.')
    print()