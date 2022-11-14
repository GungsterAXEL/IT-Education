// Задача 56. Задайте прямоугольный двумерный массив.
// Напишите программу, которая будет находить строку с наименьшей суммой элементов.

// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 5 2 6 7

// Программа считает сумму элементов в каждой строке
// и выдаёт номер строки с наименьшей суммой элементов: 1 строка.

int[,] IntMatrixRandomizer(int lines, int columns, int minValue, int maxValue)
{
    Random random = new Random();
    int[,] matrix = new int[lines, columns];
    for (int i = 0; i < lines; i++)
    {
        for (int j = 0; j < columns; j++)
        {
            matrix[i, j] = random.Next(minValue, maxValue);
        }
    }
    return matrix;
}

void MatrixPrinter(int[,] matrix)
{
    int lines = matrix.GetLength(0),
        columns = matrix.GetLength(1);
    Console.WriteLine(new string('-', columns * 5 + 11));
    for (int i = 0; i < lines; i++)
    {
        Console.Write($"Строка {i + 1,2}|");
        for (int j = 0; j < columns; j++)
        {
            Console.Write($"{matrix[i, j],5}");
        }
        Console.WriteLine("|");
    }
    Console.WriteLine(new string('-', columns * 5 + 11));
}

int[] MatrixLineSummator(int[,] matrix)
{
    int lines = matrix.GetLength(0),
        columns = matrix.GetLength(1);
    int[] array = new int[matrix.GetLength(0)];
    for (int i = 0; i < array.LongLength; i++)
    {
        for (int j = 0; j < columns; j++)
        {
            array[i] += matrix[i, j];
        }
    }
    return array;
}

void ArraySummatorPrinter(int[] array)
{
    int minValue = array[0],
        minValueCoordinate = 0,
        count = 0;
    for (count = 1; count != array.Length; count++)
    {
        // 67я строка использовалась для отладки.
        // Console.WriteLine($"Сумма{count + 1,3}й строки = {array[count]}.");
        if (minValue > array[count])
        {
            minValue = array[count];
            minValueCoordinate = count;
        }
    }
    Console.WriteLine($"Строка с наименьшей суммой элементов ({minValue}): {minValueCoordinate + 1}я строка.");
}

bool restart = true;
while (restart)
{
    Console.Clear();

    Random randomizer = new Random();
    int randomLines = randomizer.Next(1, 21),
        randomColumns = randomizer.Next(1, 21),
        randomMinValue = randomizer.Next(-1000, 1),
        randomMaxValue = randomizer.Next(1, 1001);

    int[,] randomMatrix = IntMatrixRandomizer(randomLines, randomColumns, randomMinValue, randomMaxValue);
    MatrixPrinter(randomMatrix);
    int[] matrixLineSummator = MatrixLineSummator(randomMatrix);
    ArraySummatorPrinter(matrixLineSummator);

    Console.Write("Продолжить? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}