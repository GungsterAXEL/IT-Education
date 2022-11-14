// Задача 32: Напишите программу замены элементов массива.
// Положительные элементы замените на соответствующие отрицательные,
// и наоборот.
// [-4, -8, 8, 2] -> [4, 8, -8, -2]

int[] IntArrayRandomizer(int size, int min, int max)
{
    int[] array = new int[size];
    Random random = new Random();
    for (int i = 0; i < size; i++)
    {
        array[i] = random.Next(min, max + 1);
    }
    return array;
}
void PrintArray(int[] array)
{
    Console.Write("[");
    for (int i = 0; i < array.Length; i++)
    {
        if (i < array.Length - 1) Console.Write($"{array[i]}, ");
        else Console.Write($"{array[i]}");
    }
    Console.WriteLine("]");
}
int[] InverseArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = -array[i];
    }
    return array;
}

bool restart = true;
while (restart)
{
    Console.Clear();

    Random randomizer = new Random();
    int randomSize = randomizer.Next(2, 16),
        randomMin = randomizer.Next(-100, 0),
        randomMax = randomizer.Next(0, 101);

    int[] arr = IntArrayRandomizer(randomSize, randomMin, randomMax);
    PrintArray(arr);
    int[] result = InverseArray(arr);
    PrintArray(result);

    Console.WriteLine("\nПовторить?");
    Console.Write("'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}