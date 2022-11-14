// Задача 63: Задайте значение N. Напишите программу, которая выведет
// все натуральные числа в промежутке от 1 до N.
// N = 5 -> "1, 2, 3, 4, 5"
// N = 6 -> "1, 2, 3, 4, 5, 6"

void NaturalNumbers(int num)
{
    if (num == 0) return;
    NaturalNumbers(num - 1);
    Console.Write($"{num} ");
}

Console.Clear();

int number = 0;

Console.Write("Введите число: ");
while (!int.TryParse(Console.ReadLine(), out number))
{
    Console.Write("Ошибка ввода. \nВведите число: ");
}

NaturalNumbers(number);