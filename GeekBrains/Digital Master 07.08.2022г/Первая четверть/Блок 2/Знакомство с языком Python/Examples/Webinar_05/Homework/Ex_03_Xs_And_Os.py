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
'''
from Zero import xs_and_os_input_checker as xaoic, win_lose_checker as wlc, message_choice, print_board

rules = 'Правила игры:\n\
Игроки по очереди ставят на свободные клетки (поля 3×3) знаки.\n\
Один всегда крестики, другой всегда нолики.\n\
Первый, выстроивший в ряд 3 своих фигуры по вертикали, горизонтали или диагонали, выигрывает.\n\
Первый ход делает игрок, ставящий крестики.'
win_message = ['Ура!', 'Отлично!', 'Красаучег!']
none_message = ['Ничья!', 'Оба победили!', 'Мир всем!']
figures = ['✿', '✪']
game_cell = [1, 2, 3, 4, 5, 6, 7, 8, 9]

print(rules)
step = 0
win_lose = True
while win_lose:
    print(f'\n{print_board(game_cell)}')
    user_choice = xaoic(
        f'Выберите клетку для знака {figures[step % 2]}: ', game_cell)
    game_cell[user_choice - 1] = figures[step % 2]
    win_lose = wlc(game_cell)
    if win_lose == False:
        break
    elif win_lose == True and step == 8:
        break
    step += 1

if win_lose == False:
    print(f'{message_choice(win_message)} Выиграл {figures[step % 2]}.')
else:
    print('Ничья!')