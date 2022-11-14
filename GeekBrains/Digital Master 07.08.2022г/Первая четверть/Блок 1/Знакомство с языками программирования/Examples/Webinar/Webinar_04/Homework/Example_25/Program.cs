// Задача 25: Напишите цикл, который принимает на вход два числа (A и B)
// и возводит число A в натуральную степень B.
// 3, 5 -> 243 (3⁵)
// 2, 4 -> 16

double ABPower(int a1, int b1)
{
    double abPower = 1;
    if (b1 >= 0)
        for (int i = 0; i < b1; i++)
        {
            abPower *= a1;
        }
    else
        for (int i = 0; i > b1; i--)
        {
            abPower /= a1;
        }
    return abPower;
}

bool proceed = true;
while (proceed)
{
    Console.Clear();
    int a = default;
    int b = default;

    Console.Write("Введите число: ");
    while (!int.TryParse(Console.ReadLine(), out a))
    {
        Console.Write("Ошибка ввода, введите число: ");
    }

    Console.Write("В какую степень будем его возводить? ");
    while (!int.TryParse(Console.ReadLine(), out b))
    {
        Console.Write("Ошибка ввода, введите степень: ");
    }

    double abPowerResult = ABPower(a, b);
    Console.WriteLine($"Число {a} в {b} степени = {abPowerResult}.");

    Console.WriteLine("Нажмите 'Enter' для повтора или другую клавишу для выхода: ");
    proceed = Console.ReadKey().Key == ConsoleKey.Enter;
}
Console.WriteLine("\nПока-пока!");