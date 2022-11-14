// Задача 51: Задайте двумерный массив. Найдите сумму
// элементов, находящихся на главной диагонали (с индексами
// (0,0); (1;1) и т.д.

int[,] CreateMatrixRndInt(int rows, int columns)
{
    int[,] matrix = new int[rows, columns]; //0, 1, 2

    Random rnd = new Random();
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            matrix[i, j] = i + j;
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
            if (j < matrix.GetLength(1) - 1) Console.Write($"{matrix[i, j],5}, ");
            else Console.Write($"{matrix[i, j],5} ");
        }
        Console.WriteLine("|");
    }
}

int DiagonalSumMatrix(int[,] matrix)
{
    int diagnalSumMatrix = default;
    int oversize = 0;
    if (matrix.GetLength(0) > matrix.GetLength(1)) oversize = 1;
    for (int i = 0; i < matrix.GetLength(oversize); i++)
    {

        diagnalSumMatrix += matrix[i, i];

    }
    return diagnalSumMatrix;
}

bool restart = true;
while (restart)
{
    Console.Clear();

    Random randomizer = new Random();
    int randomRows = randomizer.Next(2, 6),
        randomColumns = randomizer.Next(2, 6);

    int[,] array2D = CreateMatrixRndInt(randomRows, randomColumns);
    PrintMatrix(array2D);
    Console.WriteLine("-------------------------------------------------------------");
    int result = DiagonalSumMatrix(array2D);
    Console.WriteLine($"Сумма элементов главной диагонали = {result}");

    Console.Write("Ещё раз? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}