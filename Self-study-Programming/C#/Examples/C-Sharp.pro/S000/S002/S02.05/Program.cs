﻿// Задача S2.5. Дана длина ребра куба.
// Найти объем куба и площадь его боковой поверхности.

// У куба 6 граней, 12 ребер и  8 вершин.
// Площадь всех поверхностей вычисляют по формуле  S = 6a^2.
// S - площадь, a - длинна ребра куба.
// Объем куба вычисляется  по формуле V = a^3.
// V - объём куба. а - длинна ребра куба.

bool proceed = true;
while (proceed)
{
    Console.Clear();
    Random rnd = new Random();
    int a = rnd.Next(1, 100);
    int v = a * a * a;
    int s = a * a;
    Console.WriteLine($"При длинне ребра куба {a}см, его объём = {v}, а площадь одной поверхности {s}");

    Console.WriteLine("\nНажмите 'Enter' для повтора или другую клавишу для выхода: ");
    proceed = Console.ReadKey().Key == ConsoleKey.Enter;
}