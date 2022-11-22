# Задача 1.
# Напишите программу, которая принимает на вход цифру, обозначающую день недели.
# И проверяет, является ли этот день выходным.
# Пример:
# - 6 -> да
# - 7 -> да
# - 1 -> нет

def IntChecker(message):
    userInput = input(message)
    try:
        userInput = int(userInput)
    except:
        print('Вводить нужно ЦЕЛОЕ число!')
        userInput = IntChecker(message)
    finally:
        return userInput


def WeekDayChecker(userInput):
    week = ["Понедельник", "Вторник", "Среда",
            "Четверг", "Пятница", "Суббота", "Воскресенье"]
    if userInput in range(1, 6):
        print(f'{week[userInput-1]} - будний день, надо бы поработать!')
    elif userInput in range(6, 8):
        print(f'{week[userInput-1]} - выходной. Балдеем!')
    else:
        print('Не гони, дружище! Такого дня недели не существует!')


restart = True
stop = 'q'
while restart:
    dayNumber = IntChecker('Введите номер дня недели: ')
    WeekDayChecker(dayNumber)

    restart = input('Выйти - Q.\nЧто-то другое - повторить.')
    if restart.lower() == stop:
        restart = False