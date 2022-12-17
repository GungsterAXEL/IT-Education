'''
Модуль для добавления ДЗ учителем.
'''
import os

os.chdir(os.path.dirname(__file__))

def homework_adding(teacher, lesson):
    homework = input(f'{teacher} введите новое домашнее задание по {lesson}: ')
    with open ('Homework.txt', 'a') as file:
        file.write(f'{teacher}; {lesson}; {homework};\n')

def homework_view():
    with open ('Homework.txt', 'r') as file:
        content = file.read()
        print(content)