﻿# Напишите программу, которая принимает на вход два числа и
# проверяет, является ли одно число квадратом другого.

a = int(input())
b = int(input())
if a*a == b:
    print("a это квадрат b")
elif b*b == a:
    print("b это квадрат a")
else:
    print("Всё не квадрат")