// Задача 33: Задайте массив. Напишите программу, которая
// определяет, присутствует ли заданное число в массиве.
// 4; массив [6, 7, 19, 345, 3] -> нет
// 3; массив [6, 7, 19, 345, 3] -> да

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
bool ArrayValueSearch(int[] array, int valueSearch)
{
    bool exist = default;
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i] == valueSearch)
        {
            exist = true;
            break;
        }

    }
    return exist;
}

bool restart = true;
while (restart)
{
    Console.Clear();

    Random randomizer = new Random();
    int randomSize = randomizer.Next(2, 16),
        randomMin = randomizer.Next(-100, 0),
        randomMax = randomizer.Next(0, 101),
        value = default;

    int[] arr = IntArrayRandomizer(randomSize, randomMin, randomMax);

    Console.Write("Введите целое число для поиска в скрытом массиве: ");
    while (!int.TryParse(Console.ReadLine(), out value))
    {
        Console.Write("Ошибка ввода. Введите целое число: ");
    }

    PrintArray(arr);

    bool result = ArrayValueSearch(arr, value);
    if (result == true) Console.WriteLine($"{value} - такое число есть.");
    else Console.WriteLine($"{value} - такого числа нет.");

    Console.WriteLine("Повторить?");
    Console.Write("'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}