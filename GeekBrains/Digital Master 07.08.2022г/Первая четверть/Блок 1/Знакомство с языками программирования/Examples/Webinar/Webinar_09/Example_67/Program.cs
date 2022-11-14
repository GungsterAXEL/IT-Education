// Задача 67: Напишите программу, которая будет принимать на вход число и
// возвращать сумму его цифр.
// 453 -> 12
// 45 -> 9

int NaturalNumbers(int num1)
{
    int sum = num1 % 10;
    if (num1 != 0)
    {
        sum += NaturalNumbers(num1 / 10);
    }
    return sum;
}

int UserNumber(int number, string message)
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
    
    int input = 0, summa = 0;

    input = UserNumber(input, "Введите число: ");
    summa = NaturalNumbers(input);
    Console.WriteLine(summa);

    Console.Write("Повторить? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}