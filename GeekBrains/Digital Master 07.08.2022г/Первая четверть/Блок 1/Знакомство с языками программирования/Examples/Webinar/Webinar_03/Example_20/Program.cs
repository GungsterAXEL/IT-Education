// Задача 20. Напишите программу, которая
// принимает на вход координаты двух точек и
// находит расстояние между ними в 2D
// пространстве.
// A (3,6); B (2,1) -> 5,09
// A (7,-5); B (1,-1) -> 7,21
Console.Clear();
Console.Write("Введите координаты точки Xa: ");
int x1 = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите координаты точки Ya: ");
int y1 = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите координаты точки Xb: ");
int x2 = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите координаты точки Yb: ");
int y2 = Convert.ToInt32(Console.ReadLine());

double AB2Distance(int xc1, int yc1, int xc2, int yc2)
{
    double d = (xc2 - xc1)*(xc2 - xc1) + (yc2 - yc1)*(yc2 - yc1);
    return Math.Round(Math.Sqrt(d), 2, MidpointRounding.ToZero);
}
Console.WriteLine(AB2Distance(x1,y1,x2,y2));