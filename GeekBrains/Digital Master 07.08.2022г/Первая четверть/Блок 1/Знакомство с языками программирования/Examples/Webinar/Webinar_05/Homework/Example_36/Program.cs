// Задача 36: Задайте одномерный массив, заполненный случайными числами.
// Найдите сумму элементов, стоящих на нечётных позициях.
// [3, 7, 23, 12] -> 19
// [-4, -6, 89, 6] -> 0

int[] IntArrayRandomizer(int size, int minValue, int maxValue)
{
    Random randomValue = new Random();
    int[] array = new int[size];
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = randomValue.Next(minValue, maxValue);
    }
    return array;
}
void PrintArray(int[] array)
{
    Console.Write("[");
    for (int i = 0; i < array.Length; i++)
    {
        if (i < array.Length - 1) Console.Write($"{array[i]}, ");
        else Console.Write($"{array[i]}] ");
    }
}
int SumOddPosition(int[] array)
{
    int sumOddPosition = default;
    for (int i = 0; i < array.Length; i++)
    {
        if (i % 2 != 0) sumOddPosition += array[i];
    }
    return sumOddPosition;
}

bool restart = true;
while (restart)
{
    Console.Clear();

    Random randomizer = new Random();
    int randomSize = randomizer.Next(2, 16),
        randomMinValue = randomizer.Next(-100, 0),
        randomMaxValue = randomizer.Next(0, 101);

    int[] randomArray = IntArrayRandomizer(randomSize, randomMinValue, randomMaxValue);
    PrintArray(randomArray);
    int sumResult = SumOddPosition(randomArray);
    Console.WriteLine($"-> Сумма элементов на нечётных позициях равна {sumResult}");

    Console.WriteLine("Повторить?");
    Console.Write("'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}