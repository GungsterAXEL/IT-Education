// Задача 66. Задайте значения M и N.
// Напишите программу, которая найдёт сумму натуральных элементов в промежутке от M до N.
// M = 1; N = 15 -> 120
// M = 4; N = 8. -> 30

int UserInsert(int number, string message)
{
    Console.Write(message);
    while (!int.TryParse(Console.ReadLine(), out number))
    {
        Console.Write($"Ошибка ввода. \n{message}");
    }
    return number;
}

int MNIntervalSum(int numberM, int numberN)
{
    if (numberM > numberN) numberM += MNIntervalSum(numberM - 1, numberN);
    else if (numberM < numberN) numberM += MNIntervalSum(numberM + 1, numberN);
    return numberM;
}

bool restart = true;
while (restart)
{
    Console.Clear();

    int m = default, n = default;
    m = UserInsert(m, "Введите первое число: ");
    n = UserInsert(n, "Введите второе число: ");

    int sum = MNIntervalSum(m, n);
    Console.WriteLine($"M = {m}; N = {n} -> {sum}.");

    Console.Write("Повторить? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}