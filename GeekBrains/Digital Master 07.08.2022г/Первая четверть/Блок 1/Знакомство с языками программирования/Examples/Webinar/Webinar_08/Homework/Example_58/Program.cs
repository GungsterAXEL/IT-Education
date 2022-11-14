// Задача 58. Задайте две матрицы.
// Напишите программу, которая будет находить произведение двух матриц.

// Например, даны 2 матрицы:
// |2 4| |3 4|
// |3 2| |3 3|

// Результирующая матрица будет:
// |18 20|
// |15 18|

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

int[,] MatrixMultiplicator(int[,] matrixA, int[,] matrixB)
{
    int linesA = matrixA.GetLength(0),
        columnsA = matrixA.GetLength(1),
        linesB = matrixB.GetLength(0),
        columnsB = matrixB.GetLength(1);
    int[,] multiplicatorResult = new int[linesA, columnsB];

    for (int i = 0; i < linesA; i++)
    {
        for (int j = 0; j < columnsB; j++)
        {
            for (int count = 0; count < linesB; count++)
            {
                multiplicatorResult[i, j] += matrixA[i, count] * matrixB[count, j];
            }

        }
    }
    return multiplicatorResult;
}

bool restart = true;
while (restart)
{
    Console.Clear();

    Random randomizer = new Random();
    int randomLines = randomizer.Next(1, 11),
        randomColumns = randomizer.Next(1, 11),
        randomMinValue = randomizer.Next(-20, 1),
        randomMaxValue = randomizer.Next(1, 21);

    int[,] firstRandomMatrix = IntMatrixRandomizer(randomLines, randomColumns, randomMinValue, randomMaxValue);
    Console.WriteLine("Матрица A: ");
    MatrixPrinter(firstRandomMatrix);

    int secondMatrixLines = firstRandomMatrix.GetLength(1),
        secondMatrixColumns = firstRandomMatrix.GetLength(0);
    int[,] secondRandomMatrix = IntMatrixRandomizer(secondMatrixLines, secondMatrixColumns, randomMinValue, randomMaxValue);
    Console.WriteLine("Матрица B: ");
    MatrixPrinter(secondRandomMatrix);

    int[,] multiplicatoRResult = MatrixMultiplicator(firstRandomMatrix, secondRandomMatrix);
    Console.WriteLine("Произведение матриц A и B: ");
    MatrixPrinter(multiplicatoRResult);

    Console.Write("Повторить? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}