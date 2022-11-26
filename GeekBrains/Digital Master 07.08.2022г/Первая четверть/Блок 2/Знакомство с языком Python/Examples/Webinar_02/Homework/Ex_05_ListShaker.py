'''
5. Реализуйте алгоритм перемешивания списка.
Из библиотеки random использовать можно только randint
'''

from random import randint


def list_randomizer():
    randomized_list = [0] * randint(1, 15)
    for i in range(len(randomized_list)):
        randomized_list[i] = randint(1, 100)
    return randomized_list


def list_shaker(some_list):
    for i in range(len(some_list)):
        temporary = some_list[i]
        mixed_position = randint(0, len(some_list) - 1)
        some_list[i] = some_list[mixed_position]
        some_list[mixed_position] = temporary
    return some_list


restart = ''
while restart == '':
    random_list = list_randomizer()
    print(random_list)
    list_shaker(random_list)
    print(random_list)

    restart = input('\nПовторить - Enter.\nЧто-то другое - выход.')
    print()