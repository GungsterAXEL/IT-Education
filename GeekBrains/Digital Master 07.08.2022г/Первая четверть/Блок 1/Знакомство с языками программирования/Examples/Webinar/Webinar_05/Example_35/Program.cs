// Задача 35: Задайте одномерный массив из 123 случайных чисел.
// Найдите количество элементов массива,
// значения которых лежат в отрезке [10,99].
// Пример для массива из 5 элементов:
// (В своём решении сделайте для 123)
// [5, 18, 123, 6, 2] -> 1
// [1, 2, 3, 6, 2] -> 0
// [10, 11, 12, 13, 14] -> 5

int[] IntArrayRandomizer(int size, int min, int max)
{
    int[] array = new int[size];
    Random rnd = new Random();
    for (int i = 0; i < size; i++)
    {
        array[i] = rnd.Next(min, max + 1);
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
int ArraySearch(int[] array)
{
    int count = default;
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i] >= 10 && array[i] <= 99)
            count++;
    }
    return count;
}

bool restart = true;
while (restart)
{
    Console.Clear();

    Random randomizer = new Random();
    int randomSize = randomizer.Next(2, 21),
        randomMin = randomizer.Next(0, 100),
        randomMax = randomizer.Next(100, 200);

    int[] arr = IntArrayRandomizer(randomSize, randomMin, randomMax);
    PrintArray(arr);
    int result = ArraySearch(arr);
    Console.WriteLine($"{result} совпадений с двузначными числами.");

    Console.WriteLine("Повторить поиск?");
    Console.Write("'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}