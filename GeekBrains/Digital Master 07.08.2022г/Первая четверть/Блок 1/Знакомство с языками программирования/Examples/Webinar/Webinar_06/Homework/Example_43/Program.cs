// Задача 43. Напишите программу, которая найдёт точку пересечения двух прямых,
// заданных уравнениями y = k1 * x + b1, y = k2 * x + b2;
// значения b1, k1, b2 и k2 задаются пользователем.
// b1 = 2, k1 = 5, b2 = 4, k2 = 9 -> (-0,5; -0,5)

// Решение.
// y = k1 * x + b1, y = k2 * x + b2;
// b1 = 2, k1 = 5, b2 = 4, k2 = 9;

// y - y = k1 * x + b1 - k2 * x - b2;
// 0 = k1 * x + b1 - k2 * x - b2;
// k2 * x - k1 * x = b1 - b2;
// (k2 - k1) * x = b1 - b2;
// x = (b1 - b2) / (k2 - k1);
// y = k2 * x + b2;

// При a = b две прямые параллельны.
// Если при этом c ≠ d, прямые различны и не имеют пересечений,
// в противном же случае прямые совпадают.

// Метод введения нужных значений вручную с проверкой ввода.
void ValueInsertion(out double b1_c, out double k1_a, out double b2_d, out double k2_b)
{
    Console.WriteLine("Введите необходимые значения для прямых:");
    // y = k1 * x + b1, y = k2 * x + b2
    Console.WriteLine("y = ax + c, y = bx + d");

    Console.Write("Введите a:");
    while (!double.TryParse(Console.ReadLine(), out k1_a))
    {
        Console.Write("Ошибка ввода. Введите a:");
    }

    Console.Write("Введите c:");
    while (!double.TryParse(Console.ReadLine(), out b1_c))
    {
        Console.Write("Ошибка ввода. Введите c:");
    }

    Console.Write("Введите b:");
    while (!double.TryParse(Console.ReadLine(), out k2_b))
    {
        Console.Write("Ошибка ввода. Введите b:");
    }

    Console.Write("Введите d:");
    while (!double.TryParse(Console.ReadLine(), out b2_d))
    {
        Console.Write("Ошибка ввода. Введите d:");
    }
}
// Метод рассчёта точек пересечения двух прямых.
void ParallelOrCoordinatesChecker(double b1_c, double k1_a, double b2_d, double k2_b, double x1, double y1)
{
    Console.WriteLine($"y = {k1_a}x + {b1_c}, y = {k2_b}x + {b2_d}");
    if (k1_a == k2_b && b1_c == b2_d)
    {
        Console.WriteLine("Прямые совпадают, у них бесконечное число точек пересечения.");
    }

    else if (k1_a == k2_b && b1_c != b2_d)
    {
        Console.WriteLine("Прямые не имеют точек пересечения, они параллельны.");
    }

    else
    {
        x1 = (b1_c - b2_d) / (k2_b - k1_a);
        y1 = k2_b * x1 + b2_d;
        Console.WriteLine($"Точка пересечения двух прямых XY({Math.Round(x1, 2)} ; {Math.Round(y1, 2)}).");
    }
}

// Начало.
// Перезапуск.
bool restart = true;
while (restart)
{
    // Очистка консоли.
    Console.Clear();
    // Объявление переменных.
    double b1 = default, k1 = default,
           b2 = default, k2 = default,
           x = default, y = default;
    // Использование методов.
    ValueInsertion(out b1, out k1, out b2, out k2);
    ParallelOrCoordinatesChecker(b1, k1, b2, k2, x, y);
    // Запрос перезапуска.
    Console.Write("Повторить? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}
// Конец.