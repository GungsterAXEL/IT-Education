﻿#Напишите программу, которая будет на вход принимать число N и выводить числа от -N до N  #Примеры:    #5 -> -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5

a = int(input())
for i in range(-a,a):
	#print(i, 2, 3, 4 sep=' ') # sep='' разделитель между элементами одного принта.
	print(i, end=', ') # Вывод в одну строку через end=''.
print(a) # Чтобы вывести последний элемент без лишней зяпятой от разделителя end=''.

for n in range(12,5, -1): # Вывод от 12 к 5 с шагом 21.
	print(n)