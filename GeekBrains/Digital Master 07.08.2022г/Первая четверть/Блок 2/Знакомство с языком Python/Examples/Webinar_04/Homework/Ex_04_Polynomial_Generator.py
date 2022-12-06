'''
4.  Задана натуральная степень k.
    Сформировать случайным образом список коэффициентов (значения от 0 до 100) многочлена
    и записать в файл многочлен степени k.

    *Пример:* 

    - k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
'''
from Hw_Methods import (equalation_generator as eqg,
                        file_writer as fw,
                        file_reader as fr,
                        float_input_checker as fic)

restart = ''
while restart == '':
    k = int(fic('Зададим максимальную степень?\nВведите целое положительное число: '))
    k_list = eqg(k)
    filename = '.\GeekBrains\Digital Master 07.08.2022г\Первая четверть\Блок 2\Знакомство с языком Python\Examples\Webinar_04\Homework\Ex_04_Equation.txt'
    fw(filename, k_list)
    print('В файл Ex_04_Equalation.txt записано: ', fr(filename))

    restart = input('\nЗаново - Enter.\nЧто-то другое - выход.\n')
