# Задача 4.
# Напишите программу, которая по заданному номеру четверти,
# показывает диапазон возможных координат точек в этой четверти (x и y).

def InputChecker(message):
    userInput = input(message)
    errorMessage = 'Ошибка!\nВведите целое число от 1 до 4: '
    try:
        userInput = int(userInput)
        if userInput not in range(1, 5):
            userInput = InputChecker(errorMessage)
    except:
        userInput = InputChecker(errorMessage)
    finally:
        return userInput


def RangeChecker(userInput):
    message = f'Возможный диапазон координат для {userInput}й четверти: '
    if userInput == 1:
        print(message, 'X и Y от 0 до ∞.')
    elif userInput == 2:
        print(message, 'X от 0 до -∞, Y от 0 до ∞.')
    elif userInput == 3:
        print(message, 'X и Y от 0 до -∞')
    else:
        print(message, 'X от 0 до ∞, Y от 0 до -∞')


restart = True
stop = 'q'
while restart:
    quarterNumber = InputChecker('Введите номер четверти: ')
    RangeChecker(quarterNumber)

    restart = input('Выйти - Q.\nЧто-то другое - повторить.')
    if restart.lower() == stop:
        restart = False