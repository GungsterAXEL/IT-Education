// Задача 29: Напишите программу, которая задаёт массив из 8 элементов
// и выводит их на экран.
// 1, 2, 5, 7, 19, 6, 1, 33 -> [1, 2, 5, 7, 19, 6, 1, 33]

void ArrayRandomFiller(int[] arr)
{
    Random randArr = new Random();
    for (int i = 0; i < arr.Length; i++)
    {
        arr[i] = randArr.Next(0, 100);
    }
}

void ArrayRandomPrint(int[] arr)
{
    for (int i = 0; i < arr.Length; i++)
    {
        if (i < arr.Length - 1) Console.Write($"{arr[i]}, ");
        else Console.Write($"{arr[i]} ->");
    }
    Console.Write(" [");
    for (int i = 0; i < arr.Length; i++)
    {
        if (i < arr.Length - 1) Console.Write($"{arr[i]}, ");
        else Console.Write($"{arr[i]}");
    }
    Console.Write("]");
}

bool proceed = true;
while (proceed)
{
    Console.Clear();

    Random index = new Random();
    int[] array = new int[index.Next(2, 15)];
    Console.WriteLine($"Массив из {array.Length} случайных элементов: ");

    ArrayRandomFiller(array);
    ArrayRandomPrint(array);

    Console.WriteLine("\nНажмите 'Enter' для повтора или другую клавишу для выхода: ");
    proceed = Console.ReadKey().Key == ConsoleKey.Enter;
}
Console.WriteLine("\nПока-пока!");