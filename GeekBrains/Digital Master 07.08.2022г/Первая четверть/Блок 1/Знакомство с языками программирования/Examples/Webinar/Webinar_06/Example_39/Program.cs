// Задача 39. Напишите программу, которая перевернёт одномерный массив.
// Последний элемент будет на первом месте, а первый - на последнем и т.д.
// [1 2 3 4 5] -> [5 4 3 2 1]
// [6 7 3 6] -> [6 3 7 6]

// Описание методов:
// Метод заполнения массива случайного размера случайными значениями.
int[] ArrayRandomizer(int size, int min, int max)
{
    int[] array = new int[size];
    Random random = new Random();
    for (int i = 0; i < size; i++)
    {
        array[i] = random.Next(min, max);
    }
    return array;
}
// Метод разворота массива.
void ArrayReverse(int[] array)
{
    int temporary = default;
    for (int i = 0; i < array.Length / 2; i++)
    {
        temporary = array[i];
        array[i] = array[array.Length - 1 - i];
        array[array.Length - 1 - i] = temporary;
    }
}
// Метод печати массива.
void ArrayPrint(int[] array)
{
    Console.Write("[");
    for (int i = 0; i < array.Length; i++)
    {
        if (i < array.Length - 1) Console.Write($"{array[i]} ");
        else Console.Write($"{array[i]}");
    }
    Console.Write("]");
}

// Начало программы.
bool restart = true;
while (restart)
{
    Console.Clear();
    // Задаём случайный размер, минимальное и максимальное значения .
    Random randomizer = new Random();
    int randomSize = randomizer.Next(1, 15),
        randomMinValue = randomizer.Next(-100, 0),
        randomMaxValue = randomizer.Next(0, 101);
    // Создаём массив случайного размера со случайными значениями.
    int[] arr = ArrayRandomizer(randomSize, randomMinValue, randomMaxValue);
    // Обращаемся к методам.
    ArrayPrint(arr);
    ArrayReverse(arr);
    Console.Write(" -> ");
    ArrayPrint(arr);
    // Запрос на повтор приложения.
    Console.Write("\nПовторить? \n'Enter - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}
// Конец.