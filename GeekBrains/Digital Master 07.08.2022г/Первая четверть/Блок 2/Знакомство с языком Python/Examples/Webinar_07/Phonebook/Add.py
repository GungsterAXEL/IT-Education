'''
Написать функцию для добавления новой записи в книгу, и сохранения в базу данных.
На входе минимум 4 переменных: Имя, Фамилия, номер и примечание.
'''
import os
import Logger
os.chdir(os.path.dirname(__file__))

def new_entry_saver(new_entry):
	new_entry = f'{new_entry[0]}, {new_entry[1]}, {new_entry[2]}, {new_entry[3]};\n'
	try:
		with open('PhoneBook.txt', 'a', encoding='utf-8') as phone_data:
			phone_data.write(new_entry)
			Logger.log_logger('New_Entry_Saver', True)
	except:
		Logger.log_logger('New_Entry_Saver', False)

