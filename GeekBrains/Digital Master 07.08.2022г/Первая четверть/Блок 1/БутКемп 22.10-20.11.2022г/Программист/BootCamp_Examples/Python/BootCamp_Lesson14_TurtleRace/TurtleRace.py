# Игра "Черепашьи гонки".
# При запуске игры отрисовывается разметка беговой дорожки и появляются две черепашки.
# Скорость каждой участницы задаётся случайным образом.
# Цель игры - угадать, кто прибежит первым.

from turtle import *
from random import randint
from time import *

finish = 300 # Дистанция гонки

t1=Turtle() # Создаём объект класса "Черепахи".
t1.shape("turtle") #  Изменяем форму объекта.
t1.color("red") # Изменяем цвет объекта.
t1.penup() # Поднимаем черепашку, чтобы не рисовала.
t1.goto(-200,20) # Перемещаем черепашку по координатам
t1.pendown() # Опускаем черепашку, чтоб потом рисовала.
t1.speed(3)

t2=Turtle() # Создаём объект класса "Черепахи".
t2.shape("turtle") #  Изменяем форму объекта.
t2.color("blue") # Изменяем цвет объекта.
t2.penup() # Поднимаем черепашку, чтобы не рисовала.
t2.goto(-200,-20) # Перемещаем черепашку по координатам
t2.pendown() # Опускаем черепашку, чтоб потом рисовала.
t2.speed(3)

t3=Turtle() # Создаём объект класса "Черепахи".
t3.shape("turtle") #  Изменяем форму объекта.
t3.color("green") # Изменяем цвет объекта.
t3.penup() # Поднимаем черепашку, чтобы не рисовала.
t3.goto(-200,-60) # Перемещаем черепашку по координатам
t3.pendown() # Опускаем черепашку, чтоб потом рисовала.
t3.speed(3)

def razmetka(): # Функция рисует разметку поля.
    t=Turtle()
    t.speed(0)
    for i in range(1,27):
        t.penup()
        t.goto(-200+i*20, 50)
        t.pendown()
        t.goto(-200+i*20, -90)
    t.hideturtle()

razmetka()

def catch1(x,y): # Это обработчик реакции на нажатие.
    t1.write('Ouch!', font=('Arial', 14, 'normal')) # Пишем на экране Ауч!
    t1.fd(randint(10,15)) # Черепашка делает случайный шаг в заданном диапазоне.

t1.onclick(catch1) # К черепашке №1 прикрепляется обработчик реакции.

def catch2(x,y): # Это обработчик реакции на нажатие.
    t2.write('Eeee!', font=('Arial', 14, 'normal')) # Пишем на экране Ауч!
    t2.fd(randint(10,15)) # Черепашка делает случайный шаг в заданном диапазоне.

t2.onclick(catch2) # К черепашке №2 прикрепляется обработчик реакции.

def catch3(x,y): # Это обработчик реакции на нажатие.
    t3.write('Yeee!', font=('Arial', 14, 'normal')) # Пишем на экране Ауч!
    t3.fd(randint(10,15)) # Черепашка делает случайный шаг в заданном диапазоне.

t3.onclick(catch3) # К черепашке №3 прикрепляется обработчик реакции.

while t1.xcor()<finish and t2.xcor()<finish and t3.xcor()<finish:
    t1.forward(randint(5,10)) # Здесь черепашка двигается вперёд шагами случайной длины
    t2.forward(randint(5,10)) # в указанном диапазоне.
    t3.forward(randint(5,10))
    sleep(0.1)