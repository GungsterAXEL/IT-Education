from random import randint, uniform
'''
Тело цикла перезапуска программы.

import...

restart = ''
while restart == '':
    
    # Тело самой программы.

    restart = input('\nEnter - повторить.\nЧто-то другое - выход.')
    print()
'''


# Проверка ввода.
def int_input_checker(message):
    user_input = input(message)
    try:
        user_input = int(user_input)
    except:
        print('Ошибка ввода!')
        user_input = int_input_checker(message)
    finally:
        return user_input


# Генераторы случайных списков.
# INT
def int_list_randomizer(min_lenght=1, max_lenght=15, min_value=-10, max_value=10):
    random_lenght = randint(min_lenght, max_lenght)
    randomized_list = []
    for index in range(random_lenght):
        randomized_list.append(randint(min_value, max_value))
    return randomized_list


# FLOAT
def float_list_randomizer(min_lenght=1, max_lenght=15, min_value=-10, max_value=10, rounding=2):
    random_lenght = randint(min_lenght, max_lenght)
    randomized_list = []
    for index in range(random_lenght):
        randomized_list.append(uniform(min_value, max_value))
        randomized_list[index] = round(randomized_list[index], rounding)
    return randomized_list


# Суммирование элементов на нечётных позициях.
def odd_position_summator(int_list):
    odd_position_value = []
    odd_position_sum = 0
    for index, value in enumerate(int_list):
        if index % 2 != 0:
            odd_position_sum += value
            odd_position_value.append(value)
    return odd_position_value, odd_position_sum


# Умножение элементов на зеркальных позициях.
def mirrored_position_multiplier(int_list):
    if len(int_list) % 2 == 0:
        lenght = len(int_list) // 2
    else:
        lenght = len(int_list) // 2 + 1
    multiplier_result = []
    for index, value in enumerate(int_list[0: lenght]):
        multiplier_result.append(value * int_list[len(int_list) - index - 1])
    return multiplier_result


# Поиск минимального и максимального значения после запятой в списке.
def min_max_dot_finder(float_list, rounding=2):
    min_dot_value = max_dot_value = float_list[0] - int(float_list[0])
    for index, value in enumerate(float_list, start=1):
        float_value = value - int(value)
        if min_dot_value > float_value:
            min_dot_value = float_value
        if max_dot_value < float_value:
            max_dot_value = float_value
    return round(min_dot_value, rounding), round(max_dot_value, rounding)


# Перевод целого положительного числа в двоичный код.
def decimal_to_binary_converter(decimal_number):
    dividing_balance = 0
    multiplier = 1
    binary_equivalent = 0
    while (decimal_number > 0):
        dividing_balance = decimal_number % 2
        binary_equivalent += dividing_balance * multiplier
        multiplier *= 10
        decimal_number = decimal_number // 2
    return binary_equivalent


# Вычисление последовательности Фибоначчи от -N до N.
def fibonacci_sequence(int_number):
    n = -int_number
    fibo0 = 0
    fibo1 = 1
    fibo_negative_list = []
    while n < 0:
        fibo0, fibo1 = fibo1, fibo0 - fibo1
        n += 1
        fibo_negative_list.append(fibo0)

    n = 0
    fibo0 = 0
    fibo1 = 1
    fibo_positive_list = []
    while n < int_number+1:
        fibo_positive_list.append(fibo0)
        fibo0, fibo1 = fibo1, fibo0 + fibo1
        n += 1
    fibo_result_list = fibo_negative_list[::-1] + fibo_positive_list
    return fibo_result_list