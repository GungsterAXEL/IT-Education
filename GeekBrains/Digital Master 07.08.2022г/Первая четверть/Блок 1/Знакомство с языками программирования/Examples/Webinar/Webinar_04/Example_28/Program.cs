// Задача 28: Напишите программу, которая
// принимает на вход число N и выдаёт
// произведение чисел от 1 до N.
// 4 -> 24
// 5 -> 120

Console.Clear();

double Multiplication(double num)
{
    double mult = 1;
    for (int i = 1; i <= num; i++)
    {
        mult *= i;
    }
    return mult;
}

Console.WriteLine("Введите число: ");
double number = Convert.ToInt32(Console.ReadLine());

double result = Multiplication(number);
Console.WriteLine($"Произведение чисел от 1 до {number} составит {result}");