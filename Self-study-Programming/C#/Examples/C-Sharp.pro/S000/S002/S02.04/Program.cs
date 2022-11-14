// Задача S2.4. Считая, что Земля — идеальная сфера с радиусом R=6350 км,
// определить расстояние до линии горизонта от точки В с заданной высотой h=AB над Землей.
// D = [(R+h)^2 - R^2]^1/2

Console.Clear();

Random random = new Random();
double h = random.Next(1, 100), r = 6350000;
double d = Math.Sqrt(Math.Pow(r+h,2)-Math.Pow(r,2));
Console.Write($"Если высота = {h}м, то расстояние до горизонта = {Math.Round(d, 2)}");