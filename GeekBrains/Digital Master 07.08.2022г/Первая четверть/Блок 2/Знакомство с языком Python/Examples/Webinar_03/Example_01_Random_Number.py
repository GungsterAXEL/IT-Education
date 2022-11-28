'''
1. Реализуйте алгоритм задания случайных чисел без использования встроенного
   генератора псевдослучайных чисел.
'''
from time import time


def random_number_generator():
    random_number = time() * 1000 % 1000
    return int(random_number)


restart = ''
while restart == '':
    random_number = random_number_generator()
    print(random_number)

    restart = input('Рестарт?')

'''
Вариант из другого зала.

from time import time

def randfromtime(max):
    time1 = time()
    time1 = (time1 - int(time1))
    return int(time1 * max)

print(randfromtime(1000))
'''