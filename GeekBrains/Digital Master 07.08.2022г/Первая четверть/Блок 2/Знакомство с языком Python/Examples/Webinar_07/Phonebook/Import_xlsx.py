import os
import Logger
import openpyxl
import Add

os.chdir(os.path.dirname(__file__))


def xlsx_import():
	try:
		phonebook = openpyxl.open('PhoneBook.xlsx', read_only=True)
		sheet = phonebook.active
		for row in sheet.iter_rows(min_row=2, max_row=sheet.max_row + 1, min_col=0, max_col=4):
			temp = []
			for cell in row:
				temp.append(cell.value)
			Add.new_entry_saver(temp)
		Logger.log_logger('XLSX_Import', True)
	except:
		Logger.log_logger('XLSX_Import', False)

