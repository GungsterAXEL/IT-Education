'''
1.  Вычислить число π c заданной точностью d

    *Пример:* 

    - при $d = 0.001, π = 3.141.$    $10^{-1} ≤ d ≤10^{-10}$

    π = 2√3*(1 - (1/3)*(1/3) + (1/5)*(1/3)^2 - (1/7)*(1/3)^3… + 1/((2n + 1)*(-3)^n)…)
'''
import math
from Hw_Methods import float_input_checker as fic, pi_calculation

restart = ''
while restart == '':
    accuracy = fic('Введите значение с какой точностью искать число π: ')
    pi_c = pi_calculation(accuracy)
    print('Результат вычисления π через алгоритм: ', pi_c)
    print('Число π из модуля math для сравнения:  ', math.pi)

    restart = input('\nПовторить - Enter.\nЧто-то другое - выход.')
    print()