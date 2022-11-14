// Задача 23. Напишите программу, которая принимает на вход число (N)
// и выдаёт таблицу кубов чисел от 1 до N.
// 3 -> 1, 8, 27
// 5 -> 1, 8, 27, 64, 125

Console.Clear();
Console.Write("Введите число, до которого будем искать все кубы: ");
int n = Convert.ToInt32(Console.ReadLine());
void Cube(int n1)
{
    int count = 0;
    while (n1 == 0)
    {
        Console.Write("Куб ноля равен нулю, введите другое число: ");
        n1 = Convert.ToInt32(Console.ReadLine());
    }
    if (n1 < 0)
        while (count != n1)
        {
            count--;
            Console.WriteLine($"Куб числа {count} = {count * count * count}");
        }
    else
            {

        while (count != n1)
        {
            count++;
            Console.WriteLine($"Куб числа {count} = {count * count * count}");
        }
    }
}
Cube(n);