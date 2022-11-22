# Задача 2.
# Напишите программу для проверки истинности утверждения
# ¬(X ⋁ Y ⋁ Z) = ¬X ⋀ ¬Y ⋀ ¬Z для всех значений предикат(0, 1).

from random import randint

restart = True
stop = 'q'
while restart:
    x = randint(0, 1)
    y = randint(0, 1)
    z = randint(0, 1)

    print(f'¬({x} ⋁ {y} ⋁ {z}) = ¬{x} ⋀ ¬{y} ⋀ ¬{z}')
    if not (x or y or z) == (not x and not y and not z):
        print('Выражение верно!')
    else:
        print('Выражение неверно!')

    restart = input('Выйти - Q.\nЧто-то другое - повторить.')
    if restart.lower() == stop:
        restart = False