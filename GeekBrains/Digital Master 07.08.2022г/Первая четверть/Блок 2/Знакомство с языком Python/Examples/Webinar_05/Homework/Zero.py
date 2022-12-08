from random import randint, choice

# Случайный выбор сообщения из списка.
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


# "Взбрасывание монетки".
def coin_toss(message):
    player_name = input(choice(message))
    bot_name = ['(* ^ ω ^)', '(」°ロ°)」', '(‡▼益▼)', 'ʕ ᵔᴥᵔ ʔ']
    player_1 = player_name
    player_2 = choice(bot_name)
    
    if randint(0, 2) > 0:
        man = True
    else:
        man = False
    player_sequence = [man, player_1, player_2]
    return player_sequence