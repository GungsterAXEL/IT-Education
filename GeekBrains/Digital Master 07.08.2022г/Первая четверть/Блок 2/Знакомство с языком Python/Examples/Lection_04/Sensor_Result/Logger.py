from datetime import datetime as dt
from time import time


def temperature_logger(data):
    time = dt.now().strftime('%H:%M')
    log_file = '.\GeekBrains\Digital Master 07.08.2022г\Первая четверть\Блок 2\Знакомство с языком Python\Examples\Lection_04\Sensor_Result\Log_File.csv'
    with open(log_file, 'a') as file:
        file.write('\n{}: temperature: {}; '.format(time, data))


def pressure_logger(data):
    time = dt.now().strftime('%H:%M')
    log_file = '.\GeekBrains\Digital Master 07.08.2022г\Первая четверть\Блок 2\Знакомство с языком Python\Examples\Lection_04\Sensor_Result\Log_File.csv'
    with open(log_file, 'a') as file:
        file.write('{}: pressure: {}; '.format(time, data))


def wind_speed_logger(data):
    time = dt.now().strftime('%H:%M')
    log_file = '.\GeekBrains\Digital Master 07.08.2022г\Первая четверть\Блок 2\Знакомство с языком Python\Examples\Lection_04\Sensor_Result\Log_File.csv'
    with open(log_file, 'a') as file:
        file.write('{}: wind_speed: {};\n'.format(time, data))