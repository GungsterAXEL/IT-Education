// Задача 15: Напишите программу, которая принимает на вход цифру,
// обозначающую день недели, и проверяет, является ли этот день выходным.
// 6 -> да
// 7 -> да
// 1 -> нет

// Решение через массив:
// Console.Clear();
// Console.Write("Введите номер дня недели: ");
// int n = Convert.ToInt32(Console.ReadLine());
// string[] week = new string[] { "понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье" };
// while (n < 1 || n > 7)
// {
//     Console.Write("Но это не номер дня недели! Повторите ввод: ");
//     n = Convert.ToInt32(Console.ReadLine());
// }
// if (n == 6 || n ==7) Console.Write($"Так это же {week[n-1]}! Это выходной!");
// else Console.Write($"Так это же {week[n - 1]}! Некогда отдыхать, надо пахать!");

// Ниже решение через функцию и без массива.
Console.Clear();
Console.Write("Введите номер дня недели: ");
int n = Convert.ToInt32(Console.ReadLine());
void Week(int n1)
{
    while (n1 < 1 || n1 > 7)
    {
        Console.Write("Но это не номер дня недели! Повторите ввод: ");
        n1 = Convert.ToInt32(Console.ReadLine());
    }
    if (n1 == 6 || n1 == 7) Console.Write($"Так это же Выходной!");
    else Console.Write($"Некогда отдыхать, надо работать!");
}
Week(n);