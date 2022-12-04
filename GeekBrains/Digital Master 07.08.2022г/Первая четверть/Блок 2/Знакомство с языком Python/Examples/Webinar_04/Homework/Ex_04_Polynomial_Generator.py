'''
4.  Задана натуральная степень k.
    Сформировать случайным образом список коэффициентов (значения от 0 до 100) многочлена
    и записать в файл многочлен степени k.

    *Пример:* 

    - k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
'''
from Hw_Methods import equalation_generator as eqg

restart = ''
while restart == '':
    k = 6
    k_list = eqg(k)
    print(k_list)

    restart = input('Рестарт?\n')
