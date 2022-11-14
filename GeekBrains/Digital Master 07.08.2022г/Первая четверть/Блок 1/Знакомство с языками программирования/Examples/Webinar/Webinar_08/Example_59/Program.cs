// Задача 59: Задайте двумерный массив из целых чисел.
// Напишите программу, которая удалит строку и столбец, на
// пересечении которых расположен наименьший элемент
// массива.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 5 2 6 7
// Наименьший элемент - 1, на выходе получим
// следующий массив:
// 9 2 3
// 4 2 4
// 2 6 7

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
        Console.Write("|");
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            Console.Write($"{matrix[i, j],5} ");
        }
        Console.WriteLine("|");
    }
}
(int, int) MatrixMinValueFinder(int[,] matrix, (int, int) tuple)
{
    int minValue = matrix[0, 0];

    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            if (minValue > matrix[i, j])
            {
                minValue = matrix[i, j];
                tuple = (i, j);
            }
        }
    }
    Console.WriteLine($"Наименьшее число в матрице = {minValue}; (i{tuple.Item1}, j{tuple.Item2}).");
    return tuple;
}
void MatrixCutter(int[,] matrix, (int, int) tuple)
{
    Console.WriteLine("Сейчас вырежем лишнего...");
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        if (i != tuple.Item1)
        {
            Console.Write("|");
            for (int j = 0; j < matrix.GetLength(1); j++)
            {
                if (j != tuple.Item2) Console.Write($"{matrix[i, j],5} ");
            }
            Console.WriteLine("|");
        }
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
    (int, int) minValueCoordinate = default;

    int[,] randomMatrix = IntMatrixRandomizer(randomLines, randomColumns, randomMinValue, randomMaxValue);
    PrintMatrix(randomMatrix);
    minValueCoordinate = MatrixMinValueFinder(randomMatrix, minValueCoordinate);
    if (randomMatrix.GetLength(0) == 1 || randomMatrix.GetLength(1) == 1) Console.WriteLine("Нечего обрезать...");
    else MatrixCutter(randomMatrix, minValueCoordinate);

    Console.Write("Повторить? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}