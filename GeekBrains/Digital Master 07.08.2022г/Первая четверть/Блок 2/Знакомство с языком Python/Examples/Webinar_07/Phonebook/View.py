import os
import Logger

os.chdir(os.path.dirname(__file__))

def phonebook_view():
	try:
		with open('PhoneBook.txt', 'r', encoding='utf-8') as phone_data:
			print(phone_data.read())
			Logger.log_logger('phonebook_view', True)
	except:
		Logger.log_logger('phonebook_view', False)

