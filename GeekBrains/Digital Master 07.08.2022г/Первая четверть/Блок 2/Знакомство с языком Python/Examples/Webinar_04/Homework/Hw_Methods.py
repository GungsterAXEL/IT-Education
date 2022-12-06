import math
from random import randint, choice


# Проверка ввода.
# FLOAT
def float_input_checker(message):
    user_input = input(message)
    try:
        user_input = float(user_input.replace(',', '.'))
    except:
        print('Ошибка ввода!')
        user_input = float_input_checker(message)
    finally:
        return user_input


# Генератор списков.
# INT
def int_list_randomizer(min_lenght=1, max_lenght=15, min_value=-10, max_value=10):
    random_lenght = randint(min_lenght, max_lenght)
    randomized_list = []
    for index in range(random_lenght):
        randomized_list.append(randint(min_value, max_value))
    return randomized_list


# Генератор случайных чисел.
# INT
def random_int_number(min_value=0, max_value=101):
    return randint(min_value, max_value)


# Генератор уравнений.
# def equalation_generator(degree_power):
#    equalation_list = []
#    for i in range(degree_power + 1):
#        if random_int_number(0, 10) > 4:
#            random_number = random_int_number()
#            if degree_power - i > 1 and random_number > 1:
#                equalation_list.append(random_number)
#                equalation_list.append(f'x**{degree_power-i}')
#            elif degree_power - i == 1 and random_number > 1:
#                equalation_list.append(random_number)
#                equalation_list.append('x')
#            elif degree_power - i == 0 and random_number > 0:
#                equalation_list.append(random_number)
#            if degree_power - i > 0 and random_number in equalation_list:
#                equalation_list.append(choice('+-'))
#    equalation_list.append(' = 0')
#    return equalation_list


def equalation_generator(degree_power):
    equalation_list = []
    for i in range(degree_power + 1):
        if random_int_number(0, 2) > 0:
            random_number = random_int_number()
            if degree_power - i > 1:
                equalation_list.append(
                    f'{random_number}x**{degree_power-i}' if random_number > 1 else f'x**{degree_power - i}')
            elif degree_power - i == 1:
                equalation_list.append(f'{random_number}x' if random_number > 1 else f'x')
            else:
                if random_number != 0:
                    equalation_list.append(f'{random_number}')
            equalation_list.append(choice('+-'))
    equalation_list[len(equalation_list) - 1] = '= 0'
    return equalation_list


# Поиск уникальных элементов списка.
def unique_value_finder(number_list):
    count = 0
    unique_value_list = []
    for i, v in enumerate(number_list):
        for j, z in enumerate(number_list):
            if v == z:
                count += 1
        if count == 1:
            unique_value_list.append(v)
        count = 0
    return unique_value_list

# Вычисление π c заданной точностью.


def pi_calculation(given_accuracy=0.00001):
    n = math.inf
    pi = 2 * (3**0.5)
    some = 1
    temp = 1
    i = 3
    j = 1

    while i < n:
        temp = ((1/i) * (1/3)**j)
        if j % 2 == 1:
            some -= temp
        else:
            some += temp
        i += 2
        j += 1
        if temp < given_accuracy:
            pi *= some
            return pi


# Вычисление простых множителей числа.
def prime_factors_finder(number):
    prime_factors_list = []
    i = 2
    while i <= number:
        while number % i == 0:
            prime_factors_list.append(i)
            number /= i
        i += 1
        if number % 2 == 0:
            i = 2
    return prime_factors_list


# Запись в файл.
def file_writer(file_name, some_list):
    with open(file_name, 'w') as file:
        print(*some_list, sep=' ', file=file)


# Чтение из файла.
def file_reader(file_name):
    with open(file_name, 'r') as file:
        content = file.read()
    return content