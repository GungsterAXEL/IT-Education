'''
Mодуль логирования.
'''
import os
from datetime import datetime as dt

os.chdir(os.path.dirname(__file__))

def log_logger(operation, operation_bool_result):
    time = dt.now().strftime('%d.%m.%Y %H:%M')
    with open('Log_File.txt', 'a', encoding='utf-8') as log_file:
        log_file.write('{} - {} - {};\n'.format(time, operation, operation_bool_result))

