// Задача 26: Напишите программу, которая принимает
// на вход число и выдаёт количество цифр в числе.
// 456 -> 3
// 78 -> 2
// 89126 -> 5

Console.Clear();
Console.Write("Введите число: ");
int n = Convert.ToInt32(Console.ReadLine());

int NumbersL(int n1)
{
    int i;
    if (n1 == 0) i = 1;
    else
        for (i = 0; n1 > 0; i++)
        {
            n1 = n1 / 10;
        }
    return i;
}
int result = NumbersL(n);
Console.Write(result);
