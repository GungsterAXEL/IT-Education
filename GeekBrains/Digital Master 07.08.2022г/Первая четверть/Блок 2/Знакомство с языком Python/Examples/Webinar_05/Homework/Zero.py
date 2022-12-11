from random import randint, choice


# Случайный выбор сообщения из списка.
def message_choice(message):
    return choice(message)


# Генератор случайных чисел.
# INT
def random_int_number(min_value=0, max_value=101):
    return randint(min_value, max_value)


# Проверка выбора в игре с конфетками.
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


# Выбор количества конфет ботом.
def bot_choice(candy, max_choice):
    if candy - max_choice > max_choice * 2:
        candy_choice = random_int_number(1, max_choice)
    elif candy == max_choice or candy - max_choice > max_choice:
        candy_choice = max_choice
    elif candy - max_choice < max_choice:
        candy_choice = candy - max_choice - 1
    return candy_choice


# Проверка выбора в крестиках-ноликах.
def xs_and_os_input_checker(message, game_cell):
    user_choice = input(message)
    try:
        user_choice = int(user_choice)
        if user_choice not in range(1, 10):
            print('Выберите клетку цифрами от 1 до 9.')
            user_choice = xs_and_os_input_checker(message, game_cell)
        elif game_cell[user_choice - 1] != user_choice:
            print('Клетка занята другим символом!')
            user_choice = xs_and_os_input_checker(message, game_cell)
    except:
        print('Ошибка ввода!')
        user_choice = xs_and_os_input_checker(message, game_cell)
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


# Состояние игрового поля.
def print_board(game_cell):
    board = f'            ╔═══════════╗\n\
            ║ {game_cell[0]} ║ {game_cell[1]} ║ {game_cell[2]} ║\n\
            ║═══║═══║═══║\n\
            ║ {game_cell[3]} ║ {game_cell[4]} ║ {game_cell[5]} ║\n\
            ║═══║═══║═══║\n\
            ║ {game_cell[6]} ║ {game_cell[7]} ║ {game_cell[8]} ║\n\
       ✎﹏﹏╚═══════════╝'
    return board


# Проверка на выигрыш.
def win_lose_checker(cells):
    win_variations = ((0,1,2),(3,4,5),(6,7,8),(0,3,6),(1,4,7),(2,5,8),(0,4,8),(2,4,6))
    for variant in win_variations:
        if cells[variant[0]] == cells[variant[1]] == cells[variant[2]]:
            return False
    return True


# Может и ВинРАР.
# Архивация.
def my_winrar_compression(input_text):
    output_list = []
    count = 0
    for i in range(len(input_text) - 1):
        if input_text[i] == input_text[i + 1]:
            count += 1
        else:
            output_list.append(f'{count + 1}{input_text[i]}')
            count = 0
        if i == len(input_text) - 2:
            output_list.append(f'{count + 1}{input_text[i]}')
        elif count > 8:
            output_list.append(f'{count}{input_text[i]}')
            count = 0
    output_list = ''.join(map(str, output_list))
    return output_list


# Разархивация.
def my_winrar_decompression(input_text):
    content = []
    for i in range(len(input_text) - 1):
        if input_text[i].isdigit():
            content.append(int(input_text[i]) * input_text[i + 1])
    content = ''.join(map(str, content))
    return content