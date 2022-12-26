# Import (считывает импортируемый файл и добавляет все записи оттуда в БД)
from telebot import TeleBot, types
from .Add import *
import openpyxl
from ..Logger import Logger
import os

os.chdir(os.path.dirname(__file__))

TOKEN = '5917885348:AAHOQHN4LEGoc2zjou4D0Aco57Qg13PTCNo'

bot = TeleBot(TOKEN)

def import_file_delete(file_path):
    try:
        if os.path.isfile(file_path):
            os.remove(file_path)
            Logger.log_logger(r'Import_File_Delete: {}'.format(file_path), True)
        else:
            Logger.log_logger(r'Import_File_Delete: {} не является файлом.'.format(file_path), True)
    except:
        Logger.log_logger(r'Import_File_Delete: {}'.format(file_path), False)


def txt_import(file_path):
    try:
        with open(file_path, 'r', encoding='utf-8') as import_file:
            import_file = list(map(str, import_file))
        for line in import_file:
            line = line.replace(' ', ';')
        with open(r'Phonebook\Database\PhoneBook.txt', 'a', encoding='utf-8') as send:
            send.writelines(import_file)
            send.write('\n')
        Logger.log_logger('TXT_Import', True)
        import_file_delete(file_path)
    except:
        Logger.log_logger('TXT_Import', False)


def xlsx_import(file_path):
    try:
        phonebook = openpyxl.open(file_path, read_only=True)
        sheet = phonebook.active
        for row in sheet.iter_rows(min_row=2, max_row=sheet.max_row + 1, min_col=0, max_col=4):
            temp = []
            for cell in row:
                temp.append(cell.value)
            import_entry_saver(temp)
        Logger.log_logger('XLSX_Import', True)
        import_file_delete(file_path)
    except:
        Logger.log_logger('XLSX_Import', False)


@bot.message_handler(content_types=['document'])
def download_document(message):
    try:
        file_id = message.document.file_name
        file_id_info = bot.get_file(message.document.file_id)
        downloaded_file = bot.download_file(file_id_info.file_path)
        file_path = r'Phonebook\Database\Downloads\{}'.format(file_id)
        with open(file_path, 'wb') as new_file:
            new_file.write(downloaded_file)
        if file_id[-4:] == 'xlsx':
            xlsx_import(file_path)
        elif file_id[-4:] == '.txt':
            txt_import(file_path)
        else:
            bot.send_message(message.chat.id, text=f'С такими файлами импорт не работает!\nПопробуйте что-то другое.')
        bot.send_message(message.chat.id, text=f'Импорт завершён.')
    except:
        bot.send_message(message.chat.id, text=f'Ошибка импортирования! Обратитесь к администратору.')