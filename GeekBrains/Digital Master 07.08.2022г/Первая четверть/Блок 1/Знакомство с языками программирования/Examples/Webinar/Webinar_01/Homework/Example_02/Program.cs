// Задача 2: Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее.
// a = 5; b = 7 -> max = 7
// a = 2 b = 10 -> max = 10
// a = -9 b = -3 -> max = -3
Console.Clear();
Console.Write("Введите первое число: ");
double a = Convert.ToDouble(Console.ReadLine());
Console.Write("Введите второе число: ");
double b = Convert.ToDouble(Console.ReadLine());
if (a > b)
{
    Console.Write($"Число {a} > {b}.");
}
else if (b > a)
{
    Console.Write($"Число {b} > {a}.");
}
else
{
    Console.Write($"Числа {a} и {b} равны.");
}