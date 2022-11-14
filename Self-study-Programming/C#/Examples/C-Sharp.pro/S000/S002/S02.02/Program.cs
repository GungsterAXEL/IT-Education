// Задача S2.2: Дана сторона квадрата. Найти его периметр.
// P = 4a.
Console.Clear();
Random r = new Random();
int a = r.Next(1,100);
int p = a * 4;
Console.Write($"Если сторона квадрата = {a}, то периметр = {p}.");