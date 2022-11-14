// Задача S2.1: Составить программу.
// а) вычисления значения функции y=(7x)^2+3x+6 при любом значении x;
// б) вычисления значения функции x=(12a)^2+7a+12 при любом значении а.

Console.Clear();

Random r = new Random();
double x = r.Next(1, 100), y = r.Next(1, 100), a = r.Next(1, 100);

Console.WriteLine($"X = {x}, Y = {y}, A = {a}");

y = 7 * (Math.Pow(x, 2)) + 3 * x + 6;
x = 12 * (Math.Pow(a, 2)) + 7 * a + 12;

Console.WriteLine($"Y = {y}, X = {x}");