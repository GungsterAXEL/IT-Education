// Задача 21. Напишите программу, которая принимает на вход координаты двух точек
// и находит расстояние между ними в 3D пространстве.
// A (3,6,8); B (2,1,-7) -> 15.84
// A (7,-5, 0); B (1,-1,9) -> 11.53

Console.Clear();

Console.Write("Введите координаты точки Xa: ");
int xa = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите координаты точки Ya: ");
int ya = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите координаты точки Za: ");
int za = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите координаты точки Xb: ");
int xb = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите координаты точки Yb: ");
int yb = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите координаты точки Zb: ");
int zb = Convert.ToInt32(Console.ReadLine());

double AB3Distance(int xa1, int ya1, int za1, int xb2, int yb2, int zb2)
{
    double abdistance = (xb2 - xa1)*(xb2 - xa1) + (yb2 - ya1)*(yb2 - ya1) + (zb2 - za1)*(zb2 - za1);
    return Math.Round(Math.Sqrt(abdistance), 2, MidpointRounding.ToZero);
}
Console.WriteLine($"Расстояние между точками A и B = {AB3Distance(xa, ya, za, xb, yb, zb)}.");
