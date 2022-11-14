// Задача S2.10. Составить программу решения линейного уравнения ax+b=0. (a ≠ 0).

// Дано: ах + b = 0
// Условие: a ≠ 0
// При a ≠ 0 корнем уравнения является x.
// х = -b : а

double LinearEquation(double b1, double a1)
{
    double x1 = -b1 / a1;
    return x1;
}

bool restart = true;
while (restart)
{
    Console.Clear();

    double a = default;
    double b = default;

    Console.Write("Введите a: ");
    while (!double.TryParse(Console.ReadLine(), out a))
    {
        Console.Write("Ошибка ввода, введите целое число: ");
    }

    Console.Write("Введите b: ");
    while (!double.TryParse(Console.ReadLine(), out b))
    {
        Console.Write("Ошибка ввода, введите целое число: ");
    }

    double leResult = LinearEquation(b, a);
    Console.WriteLine($"Корнем уравнения 'ах + b = 0' является 'x'.");
    Console.WriteLine($"При 'а = {a}', 'b = {b}'. 'X = {Math.Round(leResult, 2)}'.");

    Console.WriteLine($"Заново - 'Enter'. Любая другая клавиша - выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}