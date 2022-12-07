'''
5.  Даны два файла, в каждом из которых находится запись многочлена.
    Задача - сформировать файл, содержащий сумму многочленов.
    Коэффициенты могут быть как положительными, так и отрицательными.
    Степени многочленов могут отличаться.

    5x^6 + 2x^4 + 66
    15x^6 + 12x^5 + 33x^2 - 66

    Уравнение 1: 2*x**3 + 5*x - 3
    Уравнение 2: 5*x**2 - 2*x + 4
    Результат:   2*x**3 + 5*x**2 + 3*x + 1
'''
from Hw_Methods import (file_reader as fr,
                        polynomial_coefficient_extractor as pce,
                        polynomial_list_converter as plc,
                        dictionary_merger as dm,
                        dictionary_equation_extractor as dee)


# Чтение многочленов из файлов.
equation = '.\GeekBrains\Digital Master 07.08.2022г\Первая четверть\Блок 2\Знакомство с языком Python\Examples\Webinar_04\Homework\Ex_04_Equation.txt'
polynomial = '.\GeekBrains\Digital Master 07.08.2022г\Первая четверть\Блок 2\Знакомство с языком Python\Examples\Webinar_04\Homework\Ex_05_Polynomial.txt'
edited_equation = '.\GeekBrains\Digital Master 07.08.2022г\Первая четверть\Блок 2\Знакомство с языком Python\Examples\Webinar_04\Homework\Ex_05_Result.txt'


# Обработка многочленов, перевод в списки и конвертация в словари.
equation = plc(pce(fr(equation)))
polynomial = plc(pce(fr(polynomial)))


# Объединение словарей и суммирование коэффициентов.
polynomial_equation = dee(dm(equation, polynomial))


# Запись и чтение из файла.
with open(edited_equation, 'w') as data:
    data.write(polynomial_equation)
with open(edited_equation, 'r') as data:
    print(data.read())