'''
4. Задайте список из N элементов, заполненных числами из промежутка [-N, N].
Найдите произведение элементов на указанных позициях. Позиции вводятся с клавиатуры.
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


def index_selection_checker(message, user_range_list):
    index_input = input(message).split()
    try:
        for i in range(len(index_input)):
            index_input[i] = int(index_input[i])
            if index_input[i] > len(user_range_list) - 1 or index_input[i] < 0:
                print('Недопустимый индекс!')
                index_input = index_selection_checker(message, user_range_list)
    except:
        print('Ошибка ввода!')
        index_input = index_selection_checker(message)
    finally:
        return index_input


def user_index_multiplication(user_range_list, user_index_list):
    user_index_multiplication_result = 1
    for i in range(len(user_index_list)):
        user_index_multiplication_result *= user_range_list[user_index_list[i]]
    return user_index_multiplication_result

restart = ''
while restart == '':
    user_number = int_input_checker('Введите целое число: ')
    range_list = [i for i in range(- user_number, user_number + 1)]
    print(f'Сгенерирован список чисел:\n{range_list}')
    user_index = index_selection_checker(
        'Введите номера нужных индексов через пробел:\n', range_list)
    multiplication_result = user_index_multiplication(range_list, user_index)
    print(
        f'Результат перемножения чисел на выбранных позициях = {multiplication_result}')

    restart = input('Повторить - Enter.\nЧто-то другое - выход.')
    print()