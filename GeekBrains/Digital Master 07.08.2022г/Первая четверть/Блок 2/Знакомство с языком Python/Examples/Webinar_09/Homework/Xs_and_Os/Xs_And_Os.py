'''
    3. Создайте программу для игры в "Крестики-нолики".

         ╔═══════════╗
         ║ 1 ║ 2 ║ 3 ║
         ║═══║═══║═══║
         ║ 4 ║ 5 ║ 6 ║
         ║═══║═══║═══║
         ║ 7 ║ 8 ║ 9 ║
    ✎﹏﹏╚═══════════╝
    ✿ ✪
    U0001F479 ogre
    U0001F47A goblin
    U0001F47B ghost
    U0001F916 robot
    U0001F63A cat
'''
from random import randint, choice
import time


# Случайный выбор сообщения из списка.
def message_choice(message):
    return choice(message)


# Проверка выбора в крестиках-ноликах.
def xo_input_checker(message, game_cell, player_sequence, win_lose, step, types, bot):
    user_choice = message.text.replace(' ', '')
    try:
        if user_choice not in '123456789':
            bot.send_message(
                message.chat.id, text='Выберите клетку цифрами от 1 до 9.')
            bot.register_next_step_handler(
                message, player_step, game_cell, player_sequence, win_lose, step, types, bot)
        elif game_cell[user_choice - 1] != user_choice:
            bot.send_message(
                message.chat.id, text='Клетка занята другим символом!')
            bot.register_next_step_handler(
                message, player_step, game_cell, player_sequence, win_lose, step, types, bot)
        user_choice = int(user_choice)
    except:
        bot.send_message(
            message.chat.id, text='Не надо букавки. Надо циферки от 1 до 9.')
        bot.register_next_step_handler(
            message, player_step, game_cell, player_sequence, win_lose, step, types, bot)
    finally:
        return int(user_choice)


# Состояние игрового поля.
def print_board(game_cell):
    board = f'╔═════════╗\n║ {game_cell[0]} ║ {game_cell[1]} ║ {game_cell[2]} ║\n║══║═══║══║\n║ {game_cell[3]} ║ {game_cell[4]} ║ {game_cell[5]} ║\n║══║═══║══║\n║ {game_cell[6]} ║ {game_cell[7]} ║ {game_cell[8]} ║\n╚═════════╝'
    return board


# Проверка на выигрыш.
def win_lose_checker(message, game_cell, player_sequence, win_lose, step):
    win_variations = ((0, 1, 2), (3, 4, 5), (6, 7, 8), (0, 3, 6),
                      (1, 4, 7), (2, 5, 8), (0, 4, 8), (2, 4, 6))
    for variant in win_variations:
        if game_cell[variant[0]] == game_cell[variant[1]] == game_cell[variant[2]]:
            win_lose = False
    if win_lose == True and step == 8:
        game_end(message, player_sequence, win_lose)
    step += 1
    return win_lose


# "Взбрасывание монетки".
def coin_toss():
    coins = ['\U0001F479', '\U0001F47A',
             '\U0001F47B', '\U0001F916', '\U0001F63A']
    user_coin = choice(coins)
    bot_coin = choice(coins)
    while bot_coin == user_coin:
        bot_coin = choice(coins)
    if randint(0, 2) > 0:
        man = True
    else:
        man = False
    player_sequence = [man, user_coin, bot_coin]
    return player_sequence


# Ход игрока.
def player_step(message, game_cell, player_sequence, win_lose, step, types, bot):
    xo_markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
    xo_markup.add(*game_cell, 'Назад в меню')
    bot.send_message(
        message.chat.id, text=f'\n{print_board(game_cell)}', reply_markup=xo_markup)
    user_choice = xo_input_checker(
        message, game_cell, player_sequence, win_lose, step, types, bot)
    game_cell[user_choice - 1] = player_sequence[1]
    win_lose = win_lose_checker(
        message, game_cell, player_sequence, win_lose, step)
    bot_step(message, game_cell, player_sequence, win_lose, step, types, bot)


# Ход бота.
def bot_step(message, game_cell, player_sequence, win_lose, step, types, bot):
    time.sleep(randint(1, 5))
    bot_choice = randint(0, 9)
    while game_cell[bot_choice] == player_sequence[1] or game_cell[bot_choice] == player_sequence[2]:
        bot_choice = randint(0, 9)
    game_cell[bot_choice] = player_sequence[2]
    win_lose = win_lose_checker(
        message, game_cell, player_sequence, win_lose, step)
    xo_markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
    xo_markup.add(*game_cell, 'Назад в меню')
    bot.send_message(
        message.chat.id, text=f'\n{print_board(game_cell)}', reply_markup=xo_markup)
    bot.register_next_step_handler(
        message, player_step, game_cell, player_sequence, win_lose, step, types, bot)


def game_end(message, bot, player_sequence, win_lose):
    if win_lose == False:
        win_message = ['Ура!', 'Отлично!', 'Красаучег!']
        bot.send_message(
            message.chat.id, text=f'{choice(win_message)} Выиграл {message.from_user.first_name} {player_sequence[1]}.')
    else:
        none_message = ['Ничья!', 'Оба победили!', 'Мир всем!']
        bot.send_message(
            message.chat.id, text=f'{choice(none_message)} Выиграл {player_sequence[2]}.')
