// Задача 68. Напишите программу вычисления функции Аккермана с помощью рекурсии.
// Даны два неотрицательных числа m и n.
// m = 2, n = 3 -> A(m,n) = 9
// m = 3, n = 2 -> A(m,n) = 29

int AckermannFunction(int m, int n)
{
    if (m == 0) m = n + 1;
    else if (m > 0 && n == 0) m = AckermannFunction(m - 1, 1);
    else if (m > 0 && n > 0) m = AckermannFunction(m - 1, AckermannFunction(m, n - 1));
    return m;
}

int UserInsert(int number, string message)
{
    Console.Write(message);
    while (!int.TryParse(Console.ReadLine(), out number))
    {
        Console.Write($"Ошибка ввода. \n{message}");
    }
    return number;
}

bool restart = true;
while (restart)
{
    Console.Clear();
    int numberM = -1, numberN = -1, result = default;
    while (numberM < 0 || numberM > 3)
    {
        numberM = UserInsert(numberM, "Введите первое положительное число не больше трёх: ");
        if (numberM < 0 || numberM > 3) Console.WriteLine("Нужно вводить число от 0 до 3.");
    }
    while (numberN < 0 || numberN > 10)
    {
        numberN = UserInsert(numberN, "Введите второе положительное число не больше десяти: ");
        if (numberN < 0 || numberN > 10) Console.WriteLine("Нужно вводить число от 0 до 10.");
    }

    result = AckermannFunction(numberM, numberN);
    Console.WriteLine($"Результат вычисления функции Аккермана: {result}.");

    Console.Write("Повторить? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}