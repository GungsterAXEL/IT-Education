// Задача 64. Задайте значение N.
// Напишите программу, которая выведет все натуральные числа в промежутке от N до 1.
// Выполнить с помощью рекурсии.
// N = 5 -> "5, 4, 3, 2, 1"
// N = 8 -> "8, 7, 6, 5, 4, 3, 2, 1"

void NaturalRange(int number)
{
    if (number == 0) return;
    if (number > 1) Console.Write($"{number}, ");
    else Console.Write($"{number}.");
    NaturalRange(number - 1);
}

void NaturalRangePrinter(int number)
{
    Console.Write($"N = {number} -> \"");
    NaturalRange(number);
    Console.WriteLine("\"");
}

int UserInsert(int number, string message)
{
    Console.Write(message);
    while (!int.TryParse(Console.ReadLine(), out number))
    {
        Console.Write($"Ошибка ввода. \n{message}");
    }
    if (number <= 0)
    {
        Console.WriteLine("Нужно вводить число больше ноля!");
        UserInsert(number, message);
    }
    return number;
}

bool restart = true;
while (restart)
{
    Console.Clear();

    int n = default;
    n = UserInsert(n, "Введите целое натуральное число: ");
    NaturalRangePrinter(n);

    Console.Write("Ещё раз? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}