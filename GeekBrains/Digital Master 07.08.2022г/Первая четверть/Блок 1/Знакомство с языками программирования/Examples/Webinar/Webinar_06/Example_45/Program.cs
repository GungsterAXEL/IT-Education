// Задача 45. Напишите программу, которая будет создавать копию заданного массива с помощью поэлементного копирования.

// Описание методов.
// Метод печати массива.
void PrintArray(int[] array)
{
    Console.Write("[");
    for (int i = 0; i < array.Length; i++)
    {
        if (i != array.Length - 1) Console.Write($"{array[i]}, ");
        else Console.Write($"{array[i]}] ");
    }
}
// Метод заполнения массива по случайным критериям.
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
// Метод копирования массива в другой массив.
int[] IntArrayCopier(int[] array)
{
    int[] copiedArray = new int[array.Length];
    for (int i = 0; i < array.Length; i++)
    {
        copiedArray[i] = array[i];
    }
    return copiedArray;
}

// Начало.
// Естественно с перезапуском.
bool restart = true;
while (restart)
{
    // Очистка консоли.
    Console.Clear();
    // Блок объявления переменных со случайными значениями.
    Random randomizer = new Random();
    int randomSize = randomizer.Next(1, 10),
        randomMinValue = randomizer.Next(-100, 0),
        randomMaxValue = randomizer.Next(0, 101);
    // Объявление и заполнение массива.
    int[] randomArray = IntArrayRandomizer(randomSize, randomMinValue, randomMaxValue);
    // Печать получившегося массива.
    PrintArray(randomArray);
    // Вывод разделителя между массивами для удобочитаемости.
    Console.Write(" -> ");
    // Объявление второго массива и копирование в него элементов первого массива.
    int[] secondArray = IntArrayCopier(randomArray);
    // Печать второго массива.
    PrintArray(secondArray);
    // Подтверждение перезапуска.
    Console.Write("\nПовторить? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}
// Конец.