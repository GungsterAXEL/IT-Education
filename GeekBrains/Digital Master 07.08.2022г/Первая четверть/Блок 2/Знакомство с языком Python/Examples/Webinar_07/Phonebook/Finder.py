import os
import Logger

os.chdir(os.path.dirname(__file__))


def find_finder():
    try:
        word = input("Введи искомое значение -> ")
        with open('PhoneBook.txt', 'r', encoding='utf-8') as file:
            content = list(map(str, file.read().split('\n')))
        temp = []
        for i, v in enumerate(content):
            if word.lower() in v.lower():
                temp.append(v)
        if len(temp) == 0:
            print("Ничего не найдено!")
        else:
            for i in temp:
                print(i)
        Logger.log_logger('Find_Finder', True)
    except:
        Logger.log_logger('Find_Finder', False)

