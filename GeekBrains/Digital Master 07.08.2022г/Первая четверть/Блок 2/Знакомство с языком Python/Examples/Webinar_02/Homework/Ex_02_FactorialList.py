'''
2. Напишите программу, которая принимает на вход число N и выдает набор произведений чисел от 1 до N.

*Пример:*

- пусть N = 4, тогда [ 1, 2, 6, 24 ] (1, 1*2, 1*2*3, 1*2*3*4)
Запрещено использовать функцию factorial из библиотеки math
'''


def int_input_checker(message):
    user_input = input(message)
    try:
        user_input = int(user_input)
    except:
        print('Ошибка ввода!')
        user_input = int_input_checker(message)
    finally:
        return user_input


def factorial_d_maker(user_input):
    factorial_list = []
    factorial_number = 1
    for i in range(1, user_input + 1):
        factorial_number *= i
        factorial_list.append(factorial_number)
    return factorial_list


restart = ''
while restart == '':
    user_number = int_input_checker('Введите целое число: ')
    factorial_list_ = factorial_d_maker(user_number)
    print(f"d{user_number}! = {factorial_list_}")

    restart = input('\nEnter - заново.\nЧто-то другое - выход.')
    print()