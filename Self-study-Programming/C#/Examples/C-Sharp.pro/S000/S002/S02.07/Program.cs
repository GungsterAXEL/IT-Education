//  Задача S2.7. Даны два целых числа.
// Найти:
// а) Их среднее арифметическое;
// б) Их среднее геометрическое.

// Чтобы найти среднее геометрическое, нужно перемножить все числа
// и извлечь из них корень.
// Степень корня определяется количеством чисел.

bool proceed = true;
while (proceed)
{
    Console.Clear();

    Random randomN1 = new Random();
    Random randomN2 = new Random();
    int a = randomN1.Next(1, 10);
    int b = randomN2.Next(1, 10);

    double arithmetic_mean = (a + b) / 2;
    double geomethric_mean = Math.Pow((a * b), 1.0 / 3.0);
    Console.WriteLine($"Числа {a} и {b}, их среднее арифметическое {arithmetic_mean}, а среднее геометрическое {Math.Round(geomethric_mean, 2)}");

    Console.WriteLine("Нажмите 'Enter' для повтора или другую клавишу для выхода.");
    proceed = Console.ReadKey().Key == ConsoleKey.Enter;
}