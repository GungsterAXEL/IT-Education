'''
    1. Напишите программу, удаляющую из файла все слова, содержащие "абв".
'''

file_name = '.\GeekBrains\Digital Master 07.08.2022г\Первая четверть\Блок 2\Знакомство с языком Python\Examples\Webinar_05\Homework\Ex_01_Words_Eraser.txt'

with open(file_name, 'r') as data:
    content = ' '.join(
        list(filter(lambda x: 'абв' not in x.lower(), data.read().split())))

with open(file_name, 'w') as data:
    data.write(content)

print(content)