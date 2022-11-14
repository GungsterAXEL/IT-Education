// Задача 52. Задайте двумерный массив из целых чисел.
// Найдите среднее арифметическое элементов в каждом столбце.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// Среднее арифметическое каждого столбца: 4,6; 5,6; 3,6; 3.

int[,] IntMatrixRandomizer(int lines, int columns, int minValue, int maxValue)
{
    Random random = new Random();
    int[,] matrix = new int[lines, columns];
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            matrix[i, j] = random.Next(minValue, maxValue);
        }
    }
    return matrix;
}
void PrintMatrix(int[,] matrix)
{
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        Console.Write($"|");
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            Console.Write($"{matrix[i, j],4} ");
        }
        Console.WriteLine("|");
    }
}
double[] MatrixColumnsArithmeticMean(int[,] matrix)
{
    int lineCount = matrix.GetLength(0),
        columnCount = matrix.GetLength(1);
    double[] columnsArithmeticMean = new double[columnCount];
    for (int i = 0; i < lineCount; i++)
    {
        for (int j = 0; j < columnCount; j++)
        {
            columnsArithmeticMean[j] += matrix[i, j];
            if (i == lineCount - 1) columnsArithmeticMean[j] /= lineCount;
        }
    }
    return columnsArithmeticMean;
}
void PrintMatrixColumnsArithmeticMeanResult(double[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        Console.WriteLine($"Среднее арифметическое элементов {i + 1}го столбца = {Math.Round(array[i], 2)}.");
    }
}

bool restart = true;
while (restart)
{
    Console.Clear();

    Random randomizer = new Random();
    int randomLines = randomizer.Next(1, 11),
        randomColumns = randomizer.Next(1, 11),
        randomMinValue = randomizer.Next(-1000, 0),
        randomMaxValue = randomizer.Next(0, 1001);

    int[,] randomMatrix = IntMatrixRandomizer(randomLines, randomColumns, randomMinValue, randomMaxValue);
    PrintMatrix(randomMatrix);
    double[] randomMatrixColumnsArithmeticMean = MatrixColumnsArithmeticMean(randomMatrix);
    PrintMatrixColumnsArithmeticMeanResult(randomMatrixColumnsArithmeticMean);

    Console.Write("Повторить? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}