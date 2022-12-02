'''
3. Задайте два числа. Напишите программу, которая найдёт НОК
   (наименьшее общее кратное) этих двух чисел.
'''
from random import randint

restart = ''
while restart == '':
    a, b = randint(1, 50), randint(1, 50)
    if a > b:
        bigger = a
        minimal = b
    else:
        bigger = b
        minimal = a

    i = 1
    while i < b + 1:
        print(i,':',i * a,':', i * b)
        i += 1

    if bigger % minimal == 0:
        print(f'Для чисел {a} и {b}.')
        print('НОК = ', bigger)
    elif bigger < 10 and minimal < 10:
        print(f'Для чисел {a} и {b}.')
        print('НОК = ', bigger * minimal)
    else:
        n_o_k = bigger
        while (n_o_k % minimal) != 0:
            n_o_k += bigger
        print(f'Для чисел {a} и {b}.')
        print('НОК = ', n_o_k)
    
    restart = input('Рестарт?')