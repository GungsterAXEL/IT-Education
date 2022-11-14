// Задача 24: Напишите программу, которая
// принимает на вход число (А) и выдаёт сумму чисел
// от 1 до А.
// 7 -> 28
// 4 -> 10
// 8 -> 36

Console.Clear();

int SummToN(int n1)
{
    int summToN = default;
    for (int i = 0; i <= n1; i++)
    {
        summToN += i;
    }
    return summToN;
}

Console.Write("Введите число: ");
int n = Convert.ToInt32(Console.ReadLine());
int sumN = SummToN(n);
Console.Write(sumN);