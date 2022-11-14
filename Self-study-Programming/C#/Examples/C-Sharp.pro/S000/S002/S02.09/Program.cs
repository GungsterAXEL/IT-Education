// Задача S2.9. Известны количество жителей в государстве и площадь его территории.
// Определить плотность населения в этом государстве.

// Плотность населения = численность населения / площадь территории.
// Плотность населения формула расчета: P=N/S.

double PopulationDensity(double n1, double s1)
{
    double p1 = n1 / s1;
    return p1;
}

bool restart = true;
while (restart)
{
    Console.Clear();

    Random randomN = new Random();
    Random randomS = new Random();
    double n = randomN.Next(1, 1000);
    double s = randomS.Next(1, 1000);

    double result = PopulationDensity(n, s);
    Console.WriteLine($"При численности населения {n} человек и площади территории {s} квадратных метров");
    Console.WriteLine($"плотность населения будет равна {Math.Round(result, 2)} человек на квадратный метр.");

    Console.WriteLine($"Для повтора нажмите 'Enter' или другую клавишу для выхода.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}