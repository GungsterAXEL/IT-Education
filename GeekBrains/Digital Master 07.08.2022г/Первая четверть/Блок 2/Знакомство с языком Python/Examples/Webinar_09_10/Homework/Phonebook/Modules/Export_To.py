import os
from ..Logger import Logger
import openpyxl

os.chdir(os.path.dirname(__file__))

def xlsx_export():
    try:
        with open(r'Phonebook\Database\PhoneBook.txt', 'r', encoding='utf-8-sig') as file:
            data = file.readlines()
        phonebook = openpyxl.Workbook()
        worksheet = phonebook.active
        for i, v in enumerate(data):
            cells = list(map(str, v.replace('\n', '').split(';')))
            worksheet.append(cells)
        phonebook.save(r'Phonebook\Database\PhoneBook.xlsx')
        phonebook.close()
        Logger.log_logger('XLSX_Export', True)
    except:
        Logger.log_logger('XLSX_Export', False)


def docx_export():
    try:
        with open (r'Phonebook\Database\PhoneBook.txt', 'r', encoding = 'utf-8') as file:
            data = file.readlines()
        with open (r'Phonebook\Database\PhoneBook.docx', 'w', encoding = 'utf-8') as send:
            send.writelines(data)
        Logger.log_logger('DOCX_Export', True)
    except:
	    Logger.log_logger('DOCX_Export', False)
