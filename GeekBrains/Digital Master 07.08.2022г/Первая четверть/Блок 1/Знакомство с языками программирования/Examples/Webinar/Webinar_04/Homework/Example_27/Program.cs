// Задача 27: Напишите программу, которая принимает на вход число
// и выдаёт сумму цифр в числе.
// 452 -> 11
// 82 -> 10
// 9012 -> 12

int SumOfDigits(int n1)
{
    int sumOfDigits = 0;
    while (n1 != 0)
    {
        if (n1 < 0) n1 = n1 * -1;
        sumOfDigits = sumOfDigits + n1 % 10;
        n1 /= 10;
    }
    return sumOfDigits;
}

bool proceed = true;
while (proceed)
{
    Console.Clear();

    int n = 0;
    Console.Write("Введите число: ");
    while (!int.TryParse(Console.ReadLine(), out n))
    {
        Console.Write("Ошибка ввода, введите число: ");
    }

    int sumOfDigitsResult = SumOfDigits(n);
    Console.WriteLine($"Сумма его цифр = {sumOfDigitsResult}.");

    Console.WriteLine("Нажмите 'Enter' для повтора или другую клавишу для выхода: ");
    proceed = Console.ReadKey().Key == ConsoleKey.Enter;
}
Console.WriteLine("\nПока-пока!");