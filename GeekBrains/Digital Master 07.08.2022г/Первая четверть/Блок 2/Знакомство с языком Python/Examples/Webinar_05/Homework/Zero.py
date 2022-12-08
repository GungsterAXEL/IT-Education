from random import randint, choice


def message_choice(message):
    return choice(message)


# Проверка выбора.
def int_choice_range_checker(message, minimum_choice, maximum_choice):
    out_message = choice(message)
    user_choice = input(out_message)
    try:
        user_choice = int(user_choice)
        if user_choice < minimum_choice or user_choice > maximum_choice:
            print(f'Минимально возможный выбор: {minimum_choice}.\
            \nМаксимальный: {maximum_choice}.')
            user_choice = int_choice_range_checker(message, minimum_choice, maximum_choice)
    except:
        print('Ошибка ввода!')
        user_choice = int_choice_range_checker(message, minimum_choice, maximum_choice)
    finally:
        return user_choice


# "Проброс монетки".
def coin_toss(message):
    player_name = input(choice(message))
    bot_name = ['(* ^ ω ^)', '(」°ロ°)」', '(‡▼益▼)', 'ʕ ᵔᴥᵔ ʔ']
    if randint(0, 2) > 0:
        player_1 = player_name
        player_2 = choice(bot_name)
    else:
        player_1 = choice(bot_name)
        player_2 = player_name
    player_sequence = {player_1 : 0, player_2 : 0}
    return player_sequence


#
#def game_process(coin_toss_result):
#    restart = ''
#    while restart == '':
