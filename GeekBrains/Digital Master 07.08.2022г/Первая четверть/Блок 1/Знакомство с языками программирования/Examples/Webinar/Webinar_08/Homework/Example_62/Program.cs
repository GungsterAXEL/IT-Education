// Задача 62. Напишите программу, которая заполнит спирально массив 4 на 4.
// Например, на выходе получается вот такой массив:
// 01 02 03 04
// 12 13 14 05
// 11 16 15 06
// 10 09 08 07

int[,] MatrixSpiralFiller(int[,] matrix)
{
    int lines = matrix.GetLength(0),
        columns = matrix.GetLength(1),
        i = 0, j = 0, number = 1;

    while (number < lines * columns)
    {
        while (j < columns - 1 && matrix[i, j + 1] == 0) { matrix[i, j] = number; number++; j++; }
        while (i < lines - 1 && matrix[i + 1, j] == 0) { matrix[i, j] = number; number++; i++; }
        while (j > 0 && matrix[i, j - 1] == 0) { matrix[i, j] = number; number++; j--; }
        while (i > 0 && matrix[i - 1, j] == 0) { matrix[i, j] = number; number++; i--; }
        // if (matrix[i, j] == 0) matrix[i, j] = number;
        matrix[i, j] = number;
    }
    return matrix;
}

void MatrixPrinter(int[,] matrix)
{
    int lines = matrix.GetLength(0),
        columns = matrix.GetLength(1);
    Console.WriteLine($"Матрица {lines} x {columns}");
    Console.WriteLine(new string('-', columns * 5));
    for (int i = 0; i < lines; i++)
    {
        Console.Write("|");
        for (int j = 0; j < columns; j++)
        {
            Console.Write($"{matrix[i, j],5}");
        }
        Console.WriteLine("|");
    }
    Console.WriteLine(new string('-', columns * 5));
}

bool restart = true;
while (restart)
{
    Console.Clear();

    Random randomizer = new Random();
    int randomLines = randomizer.Next(5, 17),
        randomColumns = randomizer.Next(5, 17);

    int[,] voidMatrix = new int[randomLines, randomColumns];
    MatrixSpiralFiller(voidMatrix);
    MatrixPrinter(voidMatrix);

    Console.Write("'Enter' - Повторить. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}