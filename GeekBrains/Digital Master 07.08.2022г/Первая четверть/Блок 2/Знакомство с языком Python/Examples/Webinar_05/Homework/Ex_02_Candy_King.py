'''
    2. Создайте программу для игры с конфетами человек против человека.

    Условие задачи: На столе лежит 2021 конфета.
    Играют два игрока делая ход друг после друга.
    Первый ход определяется жеребьёвкой.
    За один ход можно забрать не более чем 28 конфет.
    Все конфеты оппонента достаются сделавшему последний ход.
    Сколько конфет нужно взять первому игроку, чтобы забрать все
    конфеты у своего конкурента?

    a) Добавьте игру против бота
    b) Подумайте как наделить бота "интеллектом"
'''
from Zero import int_choice_range_checker as icrc, coin_toss, message_choice

candy = total = 2021
max_choice = 28
min_choice = 1
rules = f'На столе лежит 2021 конфета.\
\nИграют два игрока делая ход друг после друга.\
\nЗа один ход можно забрать не более чем {max_choice} конфет.\
\nВсе конфеты оппонента достаются забравшему последнюю конфету.\n'
hello_user = ['Здрасьте: ', 'Представьтесь: ', 'Имячко пожалуйста: ', 'Введите ник: ']
candy_count = ['Всего конфеток: ', 'Конфет осталось: ', 'Наша горсточка: ', 'Сладеньких: ']
candy_take = ['Сколько конфет возьмём: ', 'Бери конфетки: ', 'Бери этих вкусняшек: ', 'Вкусняшек надо: ']

print(rules)
turns_moves = coin_toss(hello_user)
first_p = list(turns_moves.items())[0]
second_p = list(turns_moves.items())[1]
print(first_p, ' | ', second_p)
step, fs, ss = 0
while candy > 0:
    if candy < max_choice: max_choice = candy
    print(f'{message_choice(candy_count)}{candy}.')
    if step % 2 == 0:
        print(f'Ходит {first_p}')
        candy_choice = icrc(candy_take, min_choice, max_choice)
        candy -= candy_choice
        first_p[1] += candy_choice
        fs +=1
        step += 1
    elif step % 2 == 1:
        print(f'Ходит {second_p}')
        candy_choice = icrc(candy_take, min_choice, max_choice)
        candy -= candy_choice
        second_p[1] += candy_choice
        ss += 1
        step += 1
