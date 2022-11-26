'''
3. Задайте список из n чисел последовательности (1 + 1 / n)**n и выведите на экран их сумму.

*Пример:*

- Для n = 6: [2.0, 2.25, 2.37, 2.44, 2.488, 2.52]     ->       14.072    (Округлять не обязательно)
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


def sequence_list_maker(user_input):
    sequence_list = []
    new_number = 0
    for i in range(1, user_input+1):
        new_number = (1 + 1 / i) ** i
        sequence_list.append(round(new_number, 3))
    return sequence_list


def list_numbers_summator(sequence_list):
    summator_result = 0
    for i in range(len(sequence_list)):
        summator_result += sequence_list[i]
    return summator_result


restart = ''
while restart == '':
    user_number = int_input_checker('Введите целое число: ')
    number_list = sequence_list_maker(user_number)
    summa = list_numbers_summator(number_list)

    print(f'Сумма последовательности (1 + 1 / n)^n для числа {user_number}:')
    print(f'{number_list}')
    print(f'Будет равна {summa}.')

    restart = input('\nПовторить - Enter.\nЧто-то другое - выход.')
    print()