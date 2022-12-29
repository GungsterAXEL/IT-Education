'''
Добавление новой записи в книгу, и сохранение в базу данных.
На входе одна переменная, после получения функцией разбивается на
Имя, Фамилию, номер и примечание (пробел заменяется ;).
'''
from ..Logger import Logger
import os
os.chdir(os.path.dirname(__file__))

def import_entry_saver(message_list):
	try:
		message_list = ";".join(map(str,message_list))
		with open(r'.\Phonebook\Database\PhoneBook.txt', 'a', encoding='utf-8') as phone_data:
			phone_data.write(message_list + '\n')
		Logger.log_logger('Import_Entry_Saver', True)
	except:
		Logger.log_logger('Import_Entry_Saver', False)


def new_entry_saver(message, bot):
	new_entry = message.text.replace(' ', ';')
	try:
		with open(r'.\Phonebook\Database\PhoneBook.txt', 'a', encoding='utf-8') as phone_data:
			phone_data.write(new_entry + '\n')
			bot.send_message(message.chat.id, 'Изменения внесены.')
			Logger.log_logger('New_Entry_Saver', True)
	except:
		bot.send_message(message.chat.id, 'Ошибка сохранения данных! Обратитесь к администратору.')
		Logger.log_logger('New_Entry_Saver', False)
