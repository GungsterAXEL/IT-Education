// Задача 5. Напишите программу, которая на вход принимает одно число (n),
// а на выходе показывает все целые
// числа в промежутке от -N до N.
// 4 -> "-4, -3, -2, -1, 0, 1, 2, 3, 4"
// 2 -> " -2, -1, 0, 1, 2"
Console.Clear();
Console.Write("Ведите число: ");
int num1 = Convert.ToInt32(Console.ReadLine());
int count = -num1;
while (count <= num1)
{
    Console.Write($"{count} ");
    count++;
}