﻿// Задача 10: Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает вторую цифру этого числа.
// 456 -> 5
// 782 -> 8
// 918 -> 1

Console.Clear();
int a;
do
{
    Console.Write("Введите трёхзначное число: ");
    a = Convert.ToInt32(Console.ReadLine());
}
while (a < 100 && a > -100 || a < -999 || a > 999);
a = a < 0 ? (a % 100 / 10 * -1):(a % 100 / 10);
Console.WriteLine($"Вторая цифра вашего числа: {a}");

// Ниже тоже самое, только через функцию.
// Console.Clear();
// int a = 0;
// while (a < 100 && a > -100 || a < -999 || a > 999)
// {
//     Console.Write("Введите трёхзначное число: ");
//     a = Convert.ToInt32(Console.ReadLine());
// }
// int SecondN(int a1)
// {
//     a1 = a1 < 0 ? (a1 % 100 / 10 * -1) : (a1 % 100 / 10);
//     return a1;
// }
// a = SecondN(a);
// Console.WriteLine($"Вторая цифра вашего числа: {a}");