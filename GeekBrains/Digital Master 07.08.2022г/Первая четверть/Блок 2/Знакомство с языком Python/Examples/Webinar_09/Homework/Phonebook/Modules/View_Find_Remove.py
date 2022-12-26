from telebot import TeleBot, types
from ..Logger import Logger
import os
os.chdir(os.path.dirname(__file__))

TOKEN = '5917885348:AAHOQHN4LEGoc2zjou4D0Aco57Qg13PTCNo'

bot = TeleBot(TOKEN)


@bot.message_handler()
def phonebook_view(message):
    try:
        with open(r'.\Phonebook\Database\PhoneBook.txt', 'r', encoding='utf-8') as phone_data:
            bot.send_message(message.chat.id, text=f'Все контакты:\n{phone_data.read().replace(";", " ")}\nКонец вывода.')
            Logger.log_logger('Phonebook_View', True)
    except:
        bot.send_message(
            message.chat.id, 'Ошибка! Обратитесь к администратору!')
        Logger.log_logger('Phonebook_View', False)


def phonebook_find(message):
    try:
        word = message.text
        with open(r'.\Phonebook\Database\PhoneBook.txt', 'r', encoding='utf-8') as file:
            content = list(map(str, file.read().split('\n')))
        temp = []
        for i, v in enumerate(content):
            if word.lower() in v.lower():
                temp.append(v)
        if len(temp) == 0:
            bot.send_message(message.chat.id, text='Ничего не найдено.')
        else:
            bot.send_message(message.chat.id, text='Имя Фамилия Номер Заметка:')
            for i in temp:
                bot.send_message(message.chat.id, text=f'{i}')
        Logger.log_logger(f'Phonebook_Find: {word}', True)
    except:
        Logger.log_logger(f'Phonebook_Find: {word}', False)


def phonebook_remove(message):
    try:
        word = message.text
        with open(r'.\Phonebook\Database\PhoneBook.txt', 'r', encoding='utf-8') as file:
            content = list(map(str, file.read().split('\n')))
        for index, line in enumerate(content):
            temp = []
            temp.append(line.split(';'))
            for i in temp:
                for x in i:
                    if x == word:
                        content.pop(index)
        with open(r'.\Phonebook\Database\PhoneBook.txt', 'w', encoding='utf-8') as file:
            for row in content:
                if row != '':
                    file.write(row + '\n')
        bot.send_message(message.chat.id, text='Удаление завершено.')
        Logger.log_logger(f'Phonebook_Remover: {word} ', True)
    except:
        Logger.log_logger(f'Phonebook_Remover: {word} ', False)