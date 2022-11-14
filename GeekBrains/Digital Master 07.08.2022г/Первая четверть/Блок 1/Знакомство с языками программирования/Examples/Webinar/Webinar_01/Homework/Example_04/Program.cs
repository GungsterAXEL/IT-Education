// Задача 4: Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.
// 2, 3, 7 -> 7
// 44 5 78 -> 78
// 22 3 9 -> 22
// Console.Clear();
// Console.Write("Введите первое число: ");
// double a = Convert.ToDouble(Console.ReadLine());
// Console.Write("Введите второе число: ");
// double b = Convert.ToDouble(Console.ReadLine());
// Console.Write("Введите третье число: ");
// double c = Convert.ToDouble(Console.ReadLine());
// if (a > b && a > c) // В этой строчке проверяется число переменной а самое большое или нет? 
//     // Если число самое маленькое, то дальнейшее сравнение с этой переменной не понадобится.
// {
//     Console.Write($"Число {a} самое большое.");
// }
// else if (b > c) // (a < b && b > c) - Были лишние сравнения, убрал.
// {
//     Console.Write($"Число {b} самое большое.");
// }
// else if (b < c) // (a < c && b < c) - Были лишние сравнения, убрал.
// {
//     Console.Write($"Число {c} самое большое.");
// }
// else
// {
//     Console.Write($"Что сравнивать? Числа {a}, {b} и {c} равны.");
// }
Console.Clear();
Console.Write("Введите первое число: ");
double a = Convert.ToDouble(Console.ReadLine());
Console.Write("Введите второе число: ");
double b = Convert.ToDouble(Console.ReadLine());
Console.Write("Введите третье число: ");
double c = Convert.ToDouble(Console.ReadLine());
if (a > b && a > c)
{
    Console.Write($"Число {a} самое большое.");
}
else if (b > c)
{
    Console.Write($"Число {b} самое большое.");
}
else
{
    Console.Write($"Число {c} самое большое.");
}
