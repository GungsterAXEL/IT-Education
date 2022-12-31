'''
1. Создайте программу для игры в "Крестики-нолики" при помощи виртуального окружения и PIP
2. Прикрутить бота к задачам с предыдущего семинара:
    1. Создать калькулятор для работы с рациональными и комплексными числами, организовать меню, добавив в неё систему логирования
    2. Создать телефонный справочник с возможностью импорта и экспорта данных в нескольких форматах.
'''
'''
TODO:
    Додружить бота с записной книжкой:
        Следующий выбор действия в меню возможен только после просмотра записей или выхода в главное меню - подумать как исправить.
        Осуществить работу с csv файлами (Импорт и Экспорт).
        Основную базу стоит перевести из txt формата в csv:
            Для этого необходимо переделать txt_import, чтобы он писал информацию в csv файл.
            new_entry_saver и import_entry_saver должны осуцествлять запись в csv файл.
    Подружить бота с крестиками-ноликами:
        Бот может ходить по несколько раз.
        Всё ещё вылезают ошибки выхода за пределы индекса.
    Подружить бота с конфетным королём.
    Доделать менюшки:        
        candyking_menu = ('')
'''
from telebot import TeleBot, types
from Calculator.Calculator import *
from Phonebook.Logger import *
from Phonebook.Modules.Add import *
from Phonebook.Modules.View_Find_Remove import *
from Phonebook.Modules.Import_From import *
from Phonebook.Modules.Export_To import *
from Xs_and_Os.Xs_And_Os import *
import os
os.chdir(os.path.dirname(__file__))


TOKEN = '5917885348:AAHOQHN4LEGoc2zjou4D0Aco57Qg13PTCNo'

bot = TeleBot(TOKEN)


# Главное меню.
def start_menu_markup():
    markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
    starter_menu = ('Калькулятор', 'Записная книжка',
                    'Крестики-Нолики', 'Конфетный король')
    markup.add(*starter_menu)
    return markup


# Меню калькулятора.
def calculator_markup():
    calc_markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
    back = types.KeyboardButton("Назад в меню")
    calc_markup.add(back)
    return calc_markup


# Меню меню записной книжки.
def phonebook_markup():
    phone_markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
    phonebook_menu = ('Добавить запись', 'Просмотр всех записей', 'Импорт',
                      'Экспорт', 'Поиск контакта', 'Удаление контакта', 'Назад в меню')
    phone_markup.add(*phonebook_menu)
    return phone_markup


# Выбор варианта экспорта из записной книжки.
def phonebook_export_markup():
    phone_export_markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
    phonebook_export_menu = ('*.DOCX', '*.XLSX', 'Назад в меню')
    phone_export_markup.add(*phonebook_export_menu)
    return phone_export_markup


# Меню Крестиков-Ноликов.
def xo_markup():
    xao_markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
    xo_menu = ('1', '2', '3', '4', '5', '6', '7', '8', '9', 'Назад в меню')
    xao_markup.add(*xo_menu)
    return xao_markup


'''
    Старт бота.
'''


@bot.message_handler(commands=['start'])
def start_menu(message):
    bot.send_message(chat_id=message.from_user.id, text='\U0001F929	Привет, {0}.\nВыберите пункт меню.'.format(
        message.from_user.first_name), reply_markup=start_menu_markup())


@bot.message_handler(content_types=['text'])
def answer(message):
    if message.text == 'Калькулятор':
        bot.register_next_step_handler(message, answer_calculator)
        bot.send_message(chat_id=message.from_user.id,
                         text='Введите математическое выражение:', reply_markup=calculator_markup())
    elif message.text == 'Записная книжка':
        bot.register_next_step_handler(message, answer_phonebook)
        bot.send_message(chat_id=message.from_user.id,
                         text='Выберите пункт меню.', reply_markup=phonebook_markup())
    elif message.text == 'Крестики-Нолики':
        rules = 'Правила игры:\n\
        Игроки по очереди ставят на свободные клетки (поля 3×3) знаки.\n\
        Один всегда крестики, другой всегда нолики.\n\
        Первый, выстроивший в ряд 3 своих фигуры по вертикали, горизонтали или диагонали, выигрывает.'
        xo_markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
        xo_markup.add('Старт')
        bot.send_message(chat_id=message.from_user.id,
                         text=f'{rules}', reply_markup=xo_markup)
        bot.register_next_step_handler(message, answer_xo)
    elif message.text == 'Назад в меню':
        start_menu(message)


'''
    Калькулятор.
'''


def answer_calculator(message):
    try:
        if message.text == 'Назад в меню':
            answer(message)
        else:
            bot.register_next_step_handler(message, answer_calculator)
            bot.send_message(chat_id=message.from_user.id,
                             text=f'{message.text} = {calculator(message.text)}')
        Logger.log_logger(f'Calculator: {message.text} is ', True)
    except:
        bot.send_message(chat_id=message.from_user.id,
                         text='Надо вводить математическое выражение.')
        Logger.log_logger(f'Calculator: {message.text} is ', False)


'''
    Записная книжка.
'''


def answer_phonebook(message):
    try:
        phone_markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
        phone_markup.add('Назад в меню')
        if message.text == 'Назад в меню':
            start_menu(message)
        elif message.text == 'Добавить запись':
            bot.register_next_step_handler(message, new_entry_saver, bot)
            bot.send_message(chat_id=message.from_user.id,
                             text='Введите новый контакт в формате:\nИмя Фамилия Номер Заметка', reply_markup=phone_markup)
        elif message.text == 'Просмотр всех записей':
            phonebook_view(message, bot)
            bot.register_next_step_handler(message, answer_phonebook)
        elif message.text == 'Импорт':
            bot.send_message(chat_id=message.from_user.id,
                             text=f'Загрузите файл в txt или xlsx формате.', reply_markup=phone_markup)
            bot.register_next_step_handler(message, download_document, bot)
        elif message.text == 'Экспорт':
            bot.send_message(chat_id=message.from_user.id,
                             text='В каком формате предоставить основную базу?', reply_markup=phonebook_export_markup())
            bot.register_next_step_handler(message, answer_phonebook_export)
        elif message.text == 'Поиск контакта':
            bot.send_message(chat_id=message.from_user.id,
                             text='Кого ищем?', reply_markup=phone_markup)
            bot.register_next_step_handler(message, phonebook_find, bot)
        elif message.text == 'Удаление контакта':
            phonebook_view(message, bot)
            bot.send_message(chat_id=message.from_user.id,
                             text='Кого удалим?', reply_markup=phone_markup)
            bot.register_next_step_handler(message, phonebook_remove, bot)
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
            bot.send_message(chat_id=message.from_user.id,
                             text='В такие файлы пока не импортирую.')
            start_menu(message)
        phone_markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
        phone_markup.add('Назад в меню')
        bot.send_message(chat_id=message.from_user.id,
                         text='Осталось только скачать.', reply_markup=phone_markup)
        bot.register_next_step_handler(message, answer_phonebook)
        Logger.log_logger(f'Phonebook_Export: {trouble_in}', True)
    except:
        Logger.log_logger(f'Phonebook_Export: {trouble_in}', False)


'''
    Крестики-Нолики.
'''


def answer_xo(message):
    game_cell = [' 1 ', ' 2 ', ' 3 ', ' 4 ', ' 5 ', ' 6 ', ' 7 ', ' 8 ', ' 9 ']
    player_sequence = coin_toss()
    win_lose = True
    step = 0
    bot.send_message(chat_id=message.from_user.id,
                     text=f'{print_board(game_cell)}')
    if player_sequence == False:
        bot.send_message(chat_id=message.from_user.id,
                         text=f'Первым ходит ЙЦУКЕНbot {player_sequence[2]}.', reply_markup=xo_markup())
        bot_step(message, game_cell, player_sequence,
                 win_lose, step, types, bot)
    else:
        bot.send_message(chat_id=message.from_user.id,
                         text=f'Первым ходит {message.from_user.first_name} {player_sequence[1]}.', reply_markup=xo_markup())
        bot.register_next_step_handler(
            message, player_step, game_cell, player_sequence, win_lose, step, types, bot)


'''
    Конфетный король.
'''


def answer_candyking(message):
    bot.send_message(chat_id=message.from_user.id,
                     text='Раздел находится в разработке.')
    if message.text == 'Назад в меню':
        start_menu(message)


bot.polling(none_stop=True)
