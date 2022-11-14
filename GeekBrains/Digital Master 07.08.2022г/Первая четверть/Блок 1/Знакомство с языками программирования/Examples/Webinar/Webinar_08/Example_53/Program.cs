// Задача 53: Задайте двумерный массив. Напишите программу,
// которая поменяет местами первую и последнюю строку
// массива.

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
void IntMatrixLinesChanger(int[,] matrix)
{
    int temp = default,
    linesCount = matrix.GetLength(0),
    columnsCount = matrix.GetLength(1);
    for (int i = 0; i < linesCount; i++)
    {
        for (int j = 0; j < columnsCount; j++)
        {
            if (i == 0)
            {
                temp = matrix[i, j];
                matrix[i, j] = matrix[linesCount - 1, j];
                matrix[linesCount - 1, j] = temp;
            }
        }
    }
    // return matrix;
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
    Console.WriteLine("------------------------------------------------------------------------------");
    IntMatrixLinesChanger(randomMatrix);
    PrintMatrix(randomMatrix);

    Console.Write("Повторить? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}