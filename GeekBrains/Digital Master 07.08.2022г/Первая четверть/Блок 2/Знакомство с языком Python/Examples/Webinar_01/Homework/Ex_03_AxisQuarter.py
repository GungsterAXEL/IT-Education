# Задача 3.
# Напишите программу, которая принимает на вход координаты точки (X и Y),
# причём X ≠ 0 и Y ≠ 0 и выдаёт номер четверти плоскости, в которой находится эта точка
# (или на какой оси она находится).
# Пример:
# - x=34; y=-30 -> 4
# - x=2; y=4-> 1
# - x=-34; y=-30 -> 3

def InputChecker(message):
    userInput = input(message)
    try:
        userInput = int(userInput)
        if userInput == 0:
            print('Координата не должна равняться нулю!')
            userInput = InputChecker(message)
    except:
        print('Вводить нужно ЦЕЛОЕ число!')
        userInput = InputChecker(message)
    finally:
        return userInput


def QuarterFinder(coordinateX, coordinateY):
    if coordinateX > 0 and coordinateY > 0:
        print('Указанная точка находится в первой четверти координатной плоскости.')
    elif coordinateX < 0 and coordinateY > 0:
        print('Указанная точка находится во второй четверти координатной плоскости.')
    elif coordinateX < 0 and coordinateY < 0:
        print('Указанная точка находится в третьей четверти координатной плоскости.')
    else:
        print('Указанная точка находится в четвёртой четверти координатной плоскости.')


restart = True
stop = 'q'
while restart:
    x = InputChecker('Введите координату по оси X: ')
    y = InputChecker('Введите координату по оси Y: ')
    QuarterFinder(x, y)

    restart = input('Выйти - Q.\nЧто-то другое - повторить.')
    if restart.lower() == stop:
        restart = False