// Задача 18: Напишите программу, которая по
// заданному номеру четверти, показывает диапазон
// возможных координат точек в этой четверти (x и y).

Console.Clear();
Console.Write("Введите номер четверти: ");
string x = Console.ReadLine();
string Quarter(string xc)
{
    if (xc=="1") return "x>0, y>0";
    if (xc=="2") return "x<0, y>0";
    if (xc=="3") return "x<0, y<0";
    if (xc=="4") return "x>0, y<0";
    return "Введён некорректный номер.";
}
string result = Quarter(x);
Console.WriteLine(result);