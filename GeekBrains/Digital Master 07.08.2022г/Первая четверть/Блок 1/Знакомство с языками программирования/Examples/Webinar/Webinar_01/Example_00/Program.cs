// Задача 0.
// Напишите программу, которая на вход
// принимает число и выдаёт его квадрат (число
// умноженное на само себя).
// Например:
// 4 -> 16
// -3 -> 9
// -7 -> 49
Console.Clear();
Console.Write("Введите число для получения его квадрата: ");
double number = Convert.ToDouble(Console.ReadLine());
number = number * number;
Console.WriteLine($"Квадрат вашего числа = {number}"); // Console.WriteLine("Квадрат вашего числа ="+ number) - можно и так.