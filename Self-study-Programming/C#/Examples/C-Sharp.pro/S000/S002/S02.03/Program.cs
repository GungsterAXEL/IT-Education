// Задача S2.3: Дан радиус окружности. Найти её диаметр.
// D = 2*R.
Console.Clear();
Random random = new Random();
int r = random.Next(1, 100);
int d = 2 * r;
Console.Write($"Если радиус окружности = {r}, то диаметр = {d}.");