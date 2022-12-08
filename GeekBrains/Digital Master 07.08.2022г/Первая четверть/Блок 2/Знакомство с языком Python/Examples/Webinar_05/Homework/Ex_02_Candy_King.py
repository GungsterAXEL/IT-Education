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

candy = total = 57
max_choice = 28
min_choice = 1
rules = f'На столе лежит 2021 конфета.\
\nИграют два игрока делая ход друг после друга.\
\nЗа один ход можно забрать не более чем {max_choice} конфет.\
\nВсе конфеты оппонента достаются забравшему последнюю конфету.\n'
hello_user = ['Здрасьте: ', 'Представьтесь: ', 'Имячко пожалуйста: ', 'Введите ник: ']
candy_count = ['Всего конфеток: ', 'Конфет осталось: ', 'Наша горсточка: ', 'Сладеньких: ']
candy_take = ['Сколько конфет возьмём: ', 'Бери конфетки: ', 'Бери этих вкусняшек: ', 'Вкусняшек надо: ']
bot_talking = ['Дай: ', 'Дай мне: ', 'Хочу: ', 'Отсыпь: ']

print(rules)
turns_moves = coin_toss(hello_user)
print(turns_moves)
not_bot = turns_moves[0]
player = [turns_moves[1], 0]
bot = [turns_moves[2], 0]

step = 0
while candy > 0:
    if candy < max_choice: max_choice = candy
    print(f'{message_choice(candy_count)}{candy}.')
    if not_bot == True:
        print(f'Ходит {player[0]}.')

        candy_choice = icrc(candy_take, min_choice, max_choice)
        candy -= candy_choice
        player[1] += candy_choice
        not_bot = not not_bot
    else:
        print(f'Ходит {bot[0]}.')
        if candy - max_choice == 0:
            candy_choice = max_choice
        elif candy - max_choice == max_choice:
            candy_choice = max_choice - 1
        elif candy % max_choice == 0 and candy - max_choice > max_choice:
            candy_choice = max_choice
        elif candy % max_choice > 0 and candy - max_choice < max_choice:
            candy_choice = candy - max_choice
        else:
            candy_choice = candy % max_choice
        if candy_choice == 0: candy_choice = 1

        print(f'{message_choice(bot_talking)}{candy_choice}.')
        candy -= candy_choice
        bot[1] += candy_choice
        not_bot = not not_bot
    step += 1
    if step % 2 == 0:
        print('Положение дел: ', *player, ' vs ', *bot, '.\n')

if not_bot == True:
    print(f'{bot[0]} выиграл все конфеты.')
else:
    print(f'{player[0]} выиграл все конфеты.')