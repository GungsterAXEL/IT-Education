import os
import Logger

os.chdir(os.path.dirname(__file__))


def remover():
    try:
        word = input("Введи искомое значение -> ")
        with open('PhoneBook.txt', 'r', encoding='utf-8') as file:
            content = list(map(str, file.read().split('\n')))
        content = [i for i in content if word not in i]
        with open('PhoneBook.txt', 'w', encoding='utf-8') as file:
            for i in range(len(content)):
                file.write(content[i] + '\n')
        Logger.log_logger('Remover', True)
    except:
        Logger.log_logger('Remover', False)

