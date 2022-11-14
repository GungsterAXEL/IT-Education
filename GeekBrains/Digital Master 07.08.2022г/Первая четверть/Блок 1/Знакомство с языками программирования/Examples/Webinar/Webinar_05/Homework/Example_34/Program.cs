// Задача 34: Задайте массив заполненный случайными положительными трёхзначными числами.
// Напишите программу, которая покажет количество чётных чисел в массиве.
// [345, 897, 568, 234] -> 2

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
        if (i != array.Length - 1) Console.Write($"{array[i]}, ");
        else Console.Write($"{array[i]}] ");
    }
}
int ArrayEvenNumberFinder(int[] array)
{
    int count = default;
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i] % 2 == 0) count++;
    }
    return count;
}

bool restart = true;
while (restart)
{
    Console.Clear();

    Random randomizer = new Random();
    int randomSize = randomizer.Next(2, 16),
    randomMinValue = randomizer.Next(100, 500),
    randomMaxValue = randomizer.Next(500, 1000);

    int[] randomArray = IntArrayRandomizer(randomSize, randomMinValue, randomMaxValue);
    PrintArray(randomArray);
    int evenFinderResult = ArrayEvenNumberFinder(randomArray);
    Console.WriteLine($"-> {evenFinderResult} чётных чисел.");

    Console.WriteLine("Повторить?");
    Console.Write($"'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}