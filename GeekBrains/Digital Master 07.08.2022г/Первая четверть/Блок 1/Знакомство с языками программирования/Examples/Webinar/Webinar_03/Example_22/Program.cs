// Задача 22: Напишите программу, которая
// принимает на вход число (N) и выдаёт таблицу
// квадратов чисел от 1 до N.
// 5 -> 1, 4, 9, 16, 25.
// 2 -> 1,4

// Решение циклом, без метода.
// Console.Clear();
// Console.Write("Введите целое число: ");
// int n = Convert.ToInt32(Console.ReadLine());
// int cnt = 0;
// while (cnt != n)
// {
//     cnt++;
//     Console.WriteLine($"{cnt} {cnt*cnt}");
// }


// Решение циклом через функцию.
Console.Clear();
Console.Write("Введите целое число: ");
int n = Convert.ToInt32(Console.ReadLine());
void Sqare(int cnt)
{
    cnt = 0;
    while (cnt != n)
    {
        cnt++;
        Console.WriteLine($"Квадрат числа {cnt} = {cnt * cnt}");
    }
}
Sqare(n);


// Решение ребят с другого зала.
// Console.Clear();
// Console.WriteLine("Введите число: ");
// int digit = Convert.ToInt32(Console.ReadLine());
// int count = 1;
// void Square(int digit1, int count1)
// {
//     while(count1 <= digit1)
//     {
//         Console.WriteLine($"|{count1} -> {count1 * count1,3}|");
//         count1 ++;
//     }
// }
// Square(digit, count);