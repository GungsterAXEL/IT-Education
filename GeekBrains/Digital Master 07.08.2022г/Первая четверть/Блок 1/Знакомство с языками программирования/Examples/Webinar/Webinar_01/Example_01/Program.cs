// Задача 1. Напишите программу, которая на вход принимает два
// числа и проверяет, является ли первое число квадратом
// второго.
// a = 25, b = 5 -> да
// a = 2, b = 10 -> нет
// a = 9, b = -3 -> да
// a = -3 b = 9 -> нет
Console.Clear();
Console.Write("Введите первое целое число: ");
int num1 = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите второе целое число: ");
int num2 = Convert.ToInt32(Console.ReadLine());
if (num2 * num2 == num1) Console.WriteLine($"Первое число ({num1}) является квадратом второго ({num2}).");
else Console.WriteLine($"Первое число ({num1}) не является квадратом второго ({num2}).");