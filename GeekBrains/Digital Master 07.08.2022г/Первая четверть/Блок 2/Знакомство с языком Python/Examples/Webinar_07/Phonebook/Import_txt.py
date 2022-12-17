# Import (считывает импортируемый файл и добавляет все записи оттуда в БД)
import os
import Logger
os.chdir(os.path.dirname(__file__))


def txt_import():
    name = input('Введите имя файла без расширения: ')
    try:
        with open (f'{name}.txt', 'r', encoding = 'utf-8') as file:
            file = list(map(str, file))
        with open ('PhoneBook.txt', 'a', encoding = 'utf-8') as send:
            send.writelines(file)
        Logger.log_logger('TXT_Import', True)
    except:
	    Logger.log_logger('TXT_Import', False)

