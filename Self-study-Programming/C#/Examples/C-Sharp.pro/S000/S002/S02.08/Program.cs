// Задача S2.8. Известны объем и масса тела.
// Определить плотность материала этого тела.

// Формула p = m/V.
// p - это плотность, выражается в кг/м^3
// m = масса, в килограммах
// V = объем, в м^3.

double BodyDensity(double m1, double v1)
{
    double p1 = m1 / v1;
    return p1;
}

bool restart = true;
while (restart)
{
    Console.Clear();

    Random randomM = new Random();
    Random randomV = new Random();
    double m = randomM.Next(1, 10), v = randomV.Next(1, 10);

    double result = Math.Round(BodyDensity(m, v), 3);
    Console.WriteLine($"При массе тела в {m} кг и объёме в {v} метров кубических,");
    Console.WriteLine($"его плотность будет равна {result}.");

    Console.WriteLine($"Нажмите 'Enter' для повтора или другую клавишу для выхода.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}