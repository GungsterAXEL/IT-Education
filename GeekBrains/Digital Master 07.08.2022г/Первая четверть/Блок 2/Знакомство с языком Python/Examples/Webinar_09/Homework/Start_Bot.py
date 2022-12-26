'''
1. Создайте программу для игры в "Крестики-нолики" при помощи виртуального окружения и PIP
2. Прикрутить бота к задачам с предыдущего семинара:
    1. Создать калькулятор для работы с рациональными и комплексными числами, организовать меню, добавив в неё систему логирования
    2. Создать телефонный справочник с возможностью импорта и экспорта данных в нескольких форматах.
'''
'''
TODO:
    Прикрутить калькулятор для работы с комплексными числами.
    Додружить бота с записной книжкой:
        Следующий выбор действия в меню возможен только после просмотра записей или выхода в главное меню - подумать как исправить.
        Осуществить работу с csv файлами (Импорт и Экспорт).
        Основную базу стоит перевести из txt формата в csv:
            Для этого необходимо переделать txt_import, чтобы он писал информацию в csv файл.
            new_entry_saver и import_entry_saver должны осуцествлять запись в csv файл.
    Подружить бота с крестиками-ноликами.
    Подружить бота с конфетным королём.
    Доделать менюшки:
        xsandos_menu = ('')
        candyking_menu = ('')
'''

from telebot import TeleBot, types
from Calculator.Calculator import *
from Phonebook.Logger import *
from Phonebook.Modules.Add import *
from Phonebook.Modules.View_Find_Remove import *
from Phonebook.Modules.Import_From import *
from Phonebook.Modules.Export_To import *
import os
os.chdir(os.path.dirname(__file__))

TOKEN = '5917885348:AAHOQHN4LEGoc2zjou4D0Aco57Qg13PTCNo'

bot = TeleBot(TOKEN)


@bot.message_handler(commands=['start'])
def start_menu(message):
    markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
    markup.add(*starter_menu)
    bot.send_message(message.chat.id, 'Привет, {0}.\nВыберите пункт меню.'.format(
        message.from_user.first_name), reply_markup=markup)


@bot.message_handler(content_types=['text'])
def answer(message):
    if message.text == 'Калькулятор':
        calc_markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
        back = types.KeyboardButton("Назад в меню")
        calc_markup.add(back)
        bot.send_message(
            message.chat.id, 'Введите математическое выражение:', reply_markup=calc_markup)
        bot.register_next_step_handler(message, answer_calculator)
    elif message.text == 'Записная книжка':
        phone_markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
        phone_markup.add(*phonebook_menu)
        bot.send_message(message.chat.id, 'Выберите пункт меню.',
                         reply_markup=phone_markup)
        bot.register_next_step_handler(message, answer_phonebook)
    elif message.text == 'Назад в меню':
        start_menu(message)


def answer_calculator(message):
    try:
        if message.text == 'Назад в меню':
            start_menu(message)
        else:
            bot.send_message(chat_id=message.from_user.id,
                             text=f'{message.text} = {calculator(message.text)}')
            bot.register_next_step_handler(message, answer_calculator)
        Logger.log_logger(f'Calculator: {message.text} is ', True)
    except:
        Logger.log_logger(f'Calculator: {message.text} is ', False)


def answer_phonebook(message):
    try:
        phone_markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
        phone_markup.add('Назад в меню')
        if message.text == 'Назад в меню':
            start_menu(message)
        elif message.text == 'Добавить запись':
            bot.send_message(message.chat.id, 'Введите новый контакт в формате:\nИмя Фамилия Номер Заметка', reply_markup=phone_markup)
            bot.register_next_step_handler(message, new_entry_saver)
        elif message.text == 'Просмотр всех записей':
            phonebook_view(message)
            bot.register_next_step_handler(message, answer_phonebook)
        elif message.text == 'Импорт':
            bot.send_message(
                message.chat.id, text=f'Загрузите файл в txt или xlsx формате.', reply_markup=phone_markup)
            bot.register_next_step_handler(message, download_document)
        elif message.text == 'Экспорт':
            phone_markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
            phone_markup.add(*phonebook_export_menu)
            bot.send_message(
                message.chat.id, 'В каком формате предоставить основную базу?', reply_markup=phone_markup)
            bot.register_next_step_handler(message, answer_phonebook_export)
        elif message.text == 'Поиск контакта':
            bot.send_message(message.chat.id, text='Кого ищем?', reply_markup=phone_markup)
            bot.register_next_step_handler(message, phonebook_find)
        elif message.text == 'Удаление контакта':
            phonebook_view(message)
            bot.send_message(message.chat.id, text='Кого удалим?', reply_markup=phone_markup)
            bot.register_next_step_handler(message, phonebook_remove)
        Logger.log_logger(f'Phonebook: {message.text} ', True)
    except:
        Logger.log_logger(f'Phonebook: {message.text} ', False)


def answer_phonebook_export(message):
    try:
        trouble_in = message.text
        if message.text == 'Назад в меню':
            start_menu(message)
        elif message.text == '*.DOCX':
            docx_export()
            bot.send_document(message.chat.id, open(
                r'Phonebook\Database\PhoneBook.docx', 'rb'))
        elif message.text == '*.XLSX':
            xlsx_export()
            bot.send_document(message.chat.id, open(
                r'Phonebook\Database\PhoneBook.xlsx', 'rb'))
        else:
            bot.send_message(
                message.chat.id, text=f'В такие файлы пока не импортирую.')
            start_menu(message)
        phone_markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
        phone_markup.add('Назад в меню')
        bot.send_message(
            message.chat.id, 'Осталось только скачать.', reply_markup=phone_markup)
        bot.register_next_step_handler(message, answer_phonebook)
        Logger.log_logger(f'Phonebook_Export: {trouble_in}', True)
    except:
        Logger.log_logger(f'Phonebook_Export: {trouble_in}', False)


def answer_xsandos(message):
    bot.send_message(message.chat.id, text=f'Раздел находится в разработке.')
    if message.text == 'Назад в меню':
        start_menu(message)


def answer_candyking(message):
    bot.send_message(message.chat.id, text=f'Раздел находится в разработке.')
    if message.text == 'Назад в меню':
        start_menu(message)


global starter_menu, phonebook_menu, phonebook_export_menu
starter_menu = ('Калькулятор', 'Записная книжка',
                'Крестики-Нолики', 'Конфетный король')
phonebook_menu = ('Добавить запись', 'Просмотр всех записей', 'Импорт',
                  'Экспорт', 'Поиск контакта', 'Удаление контакта', 'Назад в меню')
phonebook_export_menu = ('*.DOCX', '*.XLSX', 'Назад в меню')

bot.polling(none_stop=True)
