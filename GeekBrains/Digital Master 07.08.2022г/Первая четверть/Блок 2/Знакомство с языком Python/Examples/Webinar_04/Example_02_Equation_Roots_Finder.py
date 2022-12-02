﻿'''2. Найдите корни квадратного уравнения Ax² + Bx + C = 0 двумя способами:С помощью математических формул нахождения корней квадратного уравнения.solve(a, b, c)Чтобы определить, сколько корней имеет уравнение, нужно обратить внимание на дискриминант.Чтобы его найти, берем формулу: D = b2 − 4ac. А вот свойства дискриминанта:если D < 0, корней нет;если D = 0, есть один корень;если D > 0, есть два различных корня.Алгоритм решения квадратного уравнения ax^2 + bx + c = 0:Вычислить его значение дискриминанта по формуле D = b2−4ac;Если дискриминант отрицательный, зафиксировать, что действительных корней нет;Если дискриминант равен нулю, вычислить единственный корень уравнения по формуле х = −b/2a;Если дискриминант положительный, найти два действительных корня квадратного уравнения по формуле корней.x1 = ((-b + (discriminant**0.5)) / (2 * a))x2 = ((-b - (discriminant**0.5)) / (2 * a))'''a = 4b = 8c = 4rounding = 3discriminant = b**2 - 4 * a * cprint(f'{a}x² + {b}x + {c} = 0')if discriminant < 0 :    print('Дискриминант меньше ноля.\nДействительных корней нет.')elif discriminant == 0:    print('Есть один корень.')    print('х = ', round((-b / ( 2 * a)), rounding))else:    print('Есть два различных корня.')    print('x1 = ', round(((-b + (discriminant**0.5)) / (2 * a)), rounding))    print('x2 = ', round(((-b - (discriminant**0.5)) / (2 * a)), rounding))