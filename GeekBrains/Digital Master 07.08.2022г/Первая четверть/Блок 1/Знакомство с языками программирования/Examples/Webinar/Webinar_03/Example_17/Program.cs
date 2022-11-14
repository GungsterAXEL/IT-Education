// Задача 17. Напишите программу, которая принимает на вход
// координаты точки (X и Y), причём X ≠ 0 и Y ≠ 0 и выдаёт
// номер четверти плоскости, в которой находится эта
// точка.

Console.Clear();
Console.Write("Введите x: ");
int x = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите y: ");
int y = Convert.ToInt32(Console.ReadLine());

string Quarter(int xc, int yc)
{
    if (xc>0 && yc>0) return "Первая четверть";
    if (xc<0 && yc>0) return "Вторая четверть";
    if (xc<0 && yc<0) return "Третья четверть";
    if (xc>0 && yc<0) return "Четвёртая четверть";
    return "Введены некорректные координаты";
}
// Console.WriteLine(Quarter(x,y)); - мой вариант.
string result = Quarter(x,y);
Console.WriteLine(result);