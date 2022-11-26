'''
1. Напишите программу, которая принимает на вход вещественное число и показывает сумму его цифр.

*Пример:*

- 6782 -> 23
- 0.56 -> 11
'''


def float_input_checker(message):
    user_input = input(message)
    try:
        user_input = float(user_input.replace(',', '.'))
    except:
        print('Ошибка ввода!')
        user_input = float_input_checker(message)
    finally:
        return user_input


def float_digits_sum(user_input):
    digits_sum = 0
    while (user_input % 1) > 0:
        user_input *= 10
    while user_input > 0:
        digits_sum += user_input % 10
        user_input //= 10
    return digits_sum


restart = ''
while restart == '':
    user_number = float_input_checker('Введите число: ')
    digit_sum = float_digits_sum(user_number)

    if user_number % 1 == 0:
        print(f'Сумма цифр числа {int(user_number)} равна {int(digit_sum)}')
    else:
        print(f'Сумма цифр числа {user_number} равна {int(digit_sum)}')

    restart = input('\nПовторить - Enter.\nЧто-то другое - выход.')
    print()