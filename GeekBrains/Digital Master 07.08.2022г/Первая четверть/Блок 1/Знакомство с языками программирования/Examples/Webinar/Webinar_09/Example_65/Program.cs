// Задача 65: Задайте значения M и N. Напишите программу, которая
// выведет все натуральные числа в промежутке от M до N.
// M = 1; N = 5 -> "1, 2, 3, 4, 5"
// M = 4; N = 8 -> "4, 6, 7, 8"

void NaturalNumbers(int num1, int num2)
{
    if (num1 == num2) Console.Write(num2);
    if (num1 > num2)
    {
        Console.Write($"{num1} ");
        NaturalNumbers(num1 - 1, num2);
    }
    if (num1 < num2)
    {
        Console.Write($"{num1} ");
        NaturalNumbers(num1 + 1, num2);
    }
}

int UserRange(int number, string message)
{
    Console.Write(message);
    while (!int.TryParse(Console.ReadLine(), out number))
    {
        Console.Write($"Ошибка ввода. \n{message}");
    }
    return number;
}

Console.Clear();

int m = default, n = default;

m = UserRange(m, "Введите первое число: ");
n = UserRange(n, "Введите второе число: ");

NaturalNumbers(m, n);