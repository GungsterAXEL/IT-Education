from telebot import TeleBot, types

TOKEN = '5747396951:AAG1aDmsQjB1U07vmTdlrpKds7qcIp1NlE8'

bot = TeleBot(TOKEN)


@bot.message_handler(content_types=['document'])
def answer(msg: types.Message):
    bot.send_message(chat_id=msg.from_user.id, text='Вывожу лог')
 
 
@bot.message_handler(commands=['start', 'help'])
def answer(msg: types.Message):
    lst = ['+', '-']
    bot.send_message(chat_id=msg.from_user.id, text=f'Введите арифметическую операцию \n{lst}')
 
 
@bot.message_handler(commands=['log'])
def answer(msg: types.Message):
    bot.send_message(chat_id=msg.from_user.id, text='Вывожу лог')
 
 
@bot.message_handler()
def answer(msg: types.Message):
 
    text = msg.text
    if text == '+':
        bot.register_next_step_handler(msg, answer1)
        bot.send_message(chat_id=msg.from_user.id, text='Введите слагаемые')
    elif text == '-':
        bot.register_next_step_handler(msg, answer2)
        bot.send_message(chat_id=msg.from_user.id, text='Введите уменьшаемое и вычитаемое')
    else:
        bot.send_message(chat_id=msg.from_user.id, text='Вы прислали: ' + msg.text +
                                                        ', а должны были арифметическое действие')
 
 
def answer1(msg):
    a, b = map(int, msg.text.split())
    bot.send_message(chat_id=msg.from_user.id, text=f'Результат сложения {a + b}')
    bot.send_message(chat_id=msg.from_user.id, text='Введите арифметическую операцию')
 
 
def answer2(msg):
    a, b = map(int, msg.text.split())
    bot.send_message(chat_id=msg.from_user.id, text=f'Результат вычитания {a - b}')
    bot.send_message(chat_id=msg.from_user.id, text='Введите арифметическую операцию')
 
 
bot.polling()