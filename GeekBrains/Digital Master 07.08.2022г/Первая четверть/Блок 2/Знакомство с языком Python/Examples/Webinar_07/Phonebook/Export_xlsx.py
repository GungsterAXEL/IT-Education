import os
import Logger
import openpyxl

os.chdir(os.path.dirname(__file__))

def xlsx_export():
    name = input('Введите имя файла без расширения: ')
    try:
        with open('PhoneBook.txt', 'r', encoding='utf-8') as file:
            data = file.readlines()
        phonebook = openpyxl.Workbook()
        worksheet = phonebook.active
        for i, v in enumerate(data):
            cells = list(map(str, v.replace('\n', '').replace(';', '').split(', ')))
            worksheet.append(cells)
        phonebook.save(f'{name}.xlsx')
        phonebook.close()
        Logger.log_logger('XLSX_Export', True)
    except:
        Logger.log_logger('XLSX_Export', False)

