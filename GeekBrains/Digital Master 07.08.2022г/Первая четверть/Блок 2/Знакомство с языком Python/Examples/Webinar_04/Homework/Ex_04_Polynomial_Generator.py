'''
4.  Задана натуральная степень k.
    Сформировать случайным образом список коэффициентов (значения от 0 до 100) многочлена
    и записать в файл многочлен степени k.

    *Пример:* 

    - k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
'''
from Hw_Methods import (equalation_generator as eqg,
                        file_writer as fw,
                        float_input_checker as fic)

restart = ''
while restart == '':
    k = int(fic('Зададим максимальную степень?\nВведите целое положительное число: '))
    k_list = eqg(k)
    fw('Equalation01.txt', k_list)
    print('В файл Equalation01.txt записано: ', *k_list, sep= "")

    restart = input('\nЗаново - Enter.\nЧто-то другое - выход.\n')
