import os
import Logger
import openpyxl


os.chdir(os.path.dirname(__file__))

def docx_export():
    name = input('Введите имя файла без расширения: ')
    try:
        with open ('PhoneBook.txt', 'r', encoding = 'utf-8') as file:
            file = file.read()
        # print(file)
        with open (f'{name}.docx', 'a', encoding = 'utf-8') as send:
            send.writelines(file)
        Logger.log_logger('DOCX_Export', True)
    except:
	    Logger.log_logger('DOCX_Export', False)

