// Задача 13: Напишите программу, которая выводит третью цифру заданного числа или сообщает, что третьей цифры нет.
// 645 -> 5
// 78 -> третьей цифры нет
// 32679 -> 6

Console.Clear();
Console.Write("Введите целое число: ");
int n = Convert.ToInt32(Console.ReadLine());
if (n > -100 && n < 100)
{
    Console.WriteLine("Третьей цифры нет!");
}
else
{
    while (n > 999 || n < -999)
    {
        n = n / 10;
    }
    n = n % 10;
    n = (n < 0) ? n * -1 : n;
    Console.WriteLine($"Вот его третья цифра: {n}.");
}

// Ниже тоже самое, но через функцию и повтор ввода, если число не трёхзначное.
// Console.Clear();
// Console.Write("Введите трёхзначное число: ");
// int n = Convert.ToInt32(Console.ReadLine());
// while (n > -100 && n < 100)
// {
//     Console.Write("Число не трёхзначное! Повторите ввод: ");
//     n = Convert.ToInt32(Console.ReadLine());
// }
// int ThirdN(int n1)
// {
//     while (n1 > 999 || n1 < -999)
//     {
//         n1 = n1 / 10;
//     }
//     n1 = n1 % 10;
//     n1 = (n1 < 0) ? n1 * -1 : n1;
//     return n1;
// }
// n = ThirdN(n);
// Console.WriteLine($"Вот его третья цифра: {n}.");
