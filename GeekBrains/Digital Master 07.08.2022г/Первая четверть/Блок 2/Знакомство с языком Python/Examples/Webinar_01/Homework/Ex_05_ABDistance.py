# Задача 5.
# Напишите программу, которая принимает на вход координаты двух точек
# и находит расстояние между ними в 2D пространстве.
# Пример:
# - A (3,6); B (2,1) -> 5,09
# - A (7,-5); B (1,-1) -> 7,21

def InputChecker(message):
    errorMessage = 'Ошибка!\n', message
    userInput = input(message)
    try:
        userInput = int(userInput)
    except:
        userInput = InputChecker(errorMessage)
    finally:
        return userInput


def AB2Distance(aX, aY, bX, bY):
    distance = ((bX - aX)**2 + (bY - aY)**2)**0.5
    return distance


restart = True
stop = 'q'
while restart:
    dotAX = InputChecker('Введите координату точки А по X: ')
    dotAY = InputChecker('Введите координату точки А по Y: ')
    dotBX = InputChecker('Введите координату точки B по X: ')
    dotBY = InputChecker('Введите координату точки А по Y: ')
    abDistance = AB2Distance(dotAX, dotAY, dotBX, dotBY)
    print(
        f'Расстояние между точками A({dotAX};{dotAY}) и B({dotBX};{dotBY}) = {abDistance:.2f}')

    restart = input('Выйти - Q.\nЧто-то другое - повторить.')
    if restart.lower() == stop:
        restart = False