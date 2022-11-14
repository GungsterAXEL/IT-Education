// Задача S2.6. Дан радиус окружности.
// Найти длину окружности и площадь круга.
// S = π r^2. - площадь круга через радиус.
// S = (1/4)π*d^2 - площадь круга через диаметр.
// l = 2πr - длина окружности через радиус.



bool proceed = true;
while (proceed)
{
    Random random = new Random();
    int r = random.Next(1, 10);
    // double l = 2 * 3.14 * r;
    // double s = 3.14 * r * r;
    double l = 2 * Math.PI * r;
    double s = Math.PI * Math.Pow(r, 2);
    Console.WriteLine($"При радиусе окружности {r}см, площадь круга будет {Math.Round(s,2)}см, а длина окружности {Math.Round(l,2)}см.");

    Console.WriteLine("Нажмите 'Enter' для повтора или другую клавишу для выхода.");
    proceed = Console.ReadKey().Key == ConsoleKey.Enter;
}