'''
    3. Создайте программу для игры в "Крестики-нолики".

         ╔═══════════╗
         ║ 1 ║ 2 ║ 3 ║
         ║═══║═══║═══║
         ║ 4 ║ 5 ║ 6 ║
         ║═══║═══║═══║
         ║ 7 ║ 8 ║ 9 ║
    ✎﹏﹏╚═══════════╝
    ✙ ⍥
'''

rules = 'Правила игры:\n\
Игроки по очереди ставят на свободные клетки (поля 3×3) знаки.\n\
Один всегда крестики, другой всегда нолики.\n\
Первый, выстроивший в ряд 3 своих фигуры по вертикали, горизонтали или диагонали, выигрывает.\n\
Первый ход делает игрок, ставящий крестики.'
win_message = ['', '', '']
figures = ['X', 'O']
game_cell = [1, 2, 3, 4, 5, 6, 7, 8, 9]


def print_board(game_cell):
    board = f'            ╔═══════════╗\n\
            ║ {game_cell[0]} ║ {game_cell[1]} ║ {game_cell[2]} ║\n\
            ║═══║═══║═══║\n\
            ║ {game_cell[3]} ║ {game_cell[4]} ║ {game_cell[5]} ║\n\
            ║═══║═══║═══║\n\
            ║ {game_cell[6]} ║ {game_cell[7]} ║ {game_cell[8]} ║\n\
       ✎﹏﹏╚═══════════╝'
    return board


print(rules)

step = 0
win_lose = True
while win_lose:
    print(print_board(game_cell))
    user_choice = int(
        input(f'Выберите клетку для знака {figures[step % 2]}: '))
    game_cell[user_choice - 1] = figures[step % 2]
    step += 1