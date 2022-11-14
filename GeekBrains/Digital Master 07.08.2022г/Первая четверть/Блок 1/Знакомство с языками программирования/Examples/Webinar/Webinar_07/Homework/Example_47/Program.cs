// Задача 47. Задайте двумерный массив размером m×n,
// заполненный случайными вещественными числами.
// m = 3, n = 4.
// 0,5 7 -2 -0,2
// 1 -3,3 8 -9,9
// 8 7,8 -7,1 9

double[,] DoubleMatrixRandomizer(int lines, int columns, double minValue, double maxValue)
{
    Random random = new Random();
    double[,] matrix = new double[lines, columns];
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            matrix[i, j] = random.NextDouble() * (maxValue - minValue) + minValue;
            matrix[i, j] = Math.Round(matrix[i, j], 2);
        }
    }
    return matrix;
}
void PrintMatrix(double[,] matrix)
{
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        Console.Write($"| ");
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            Console.Write($"{matrix[i, j],7} ");
        }
        Console.WriteLine("|");
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

    double[,] randomMatrix = DoubleMatrixRandomizer(randomLines, randomColumns, randomMinValue, randomMaxValue);
    PrintMatrix(randomMatrix);

    Console.Write("Повторить? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}