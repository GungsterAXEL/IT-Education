'''
1. Создайте программу для игры в "Крестики-нолики" при помощи виртуального окружения и PIP
2. Прикрутить бота к задачам с предыдущего семинара:
    1. Создать калькулятор для работы с рациональными и комплексными числами, организовать меню, добавив в неё систему логирования
    2. Создать телефонный справочник с возможностью импорта и экспорта данных в нескольких форматах.
'''
from telebot import TeleBot, types
import os
from Calculator import Calculator

os.chdir(os.path.dirname(__file__))

TOKEN = '5917885348:AAHOQHN4LEGoc2zjou4D0Aco57Qg13PTCNo'

bot = TeleBot(TOKEN)


@bot.message_handler(commands=['start'])
def start_menu(msg: types.Message):
    keyboard = types.ReplyKeyboardMarkup(True)
    menu = ('1. Калькулятор.', '2. Записная книжка.',
            '3. Крестики-Нолики.', '4. Конфетный Король.')
    keyboard.row(*menu)
    bot.send_message(chat_id=msg.from_user.id,
                     text='Привет! Что выберешь?\n{}\n{}\n{}\n{}'.format(*menu), reply_markup=keyboard)


@bot.message_handler()
def answer(msg: types.Message):
    text = msg.text
    menu_dict = {'1. Калькулятор.': (
        Calculator.calculator, 'Введите математическое выражение:', answer1)}
    keys = [*menu_dict.keys()]
    el1, el2, el3 = 0, 0, 0
    for key in keys:
        if text in key:
            el1, el2, el3 = menu_dict[key]
            bot.send_message(chat_id=msg.from_user.id, text=f'{el2}')
            bot.register_next_step_handler(msg, el3)


def answer1(msg):
    result = Calculator.calculator(msg.text)
    bot.send_message(chat_id=msg.from_user.id, text=f'{msg.text}={result}')


bot.polling()