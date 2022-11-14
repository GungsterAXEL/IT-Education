// Перевод числа из десятичной системы счисления в двоичную.

int UserInsertion(int number, string message)
{
    Console.Write(message);
    while (!int.TryParse(Console.ReadLine(), out number))
    {
        Console.Write($"Ошибка ввода! \n{message}");
    }
    if (number < 0)
    {
        Console.WriteLine("Работаем только с положительными числами!");
        number = UserInsertion(number, message);
    }
    return number;
}

int DecimalToBinaryConverter(int number)
{
    int ost = 0,
    multiplier = 1,
    binar = 0;
    while (number > 0)
    {
        ost = number % 2;
        binar += ost * multiplier;
        multiplier *= 10;
        number = number / 2;
    }
    return binar;
}

bool restart = true;
while (restart)
{
    Console.Clear();

    int n = default, result = default;
    n = UserInsertion(n, "Введите положительное число: ");
    result = DecimalToBinaryConverter(n);
    Console.WriteLine($"В двоичной системе счисления это: {result}.");

    Console.Write("'Enter' - Повторить. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}