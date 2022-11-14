// Задача 55: Задайте двумерный массив. Напишите программу,
// которая заменяет строки на столбцы. В случае, если это
// невозможно, программа должна вывести сообщение для
// пользователя.

// // 001.
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
int[,] IntMatrixLinesToColumnsChanger(int[,] matrix)
{
    int temp = default,
        linesCount = matrix.GetLength(0),
        columnsCount = matrix.GetLength(1);

    for (int i = 0; i < linesCount; i++)
    {
        for (int j = i + 1; j < columnsCount; j++)
        {
            temp = matrix[i, j];
            matrix[i, j] = matrix[j, i];
            matrix[j, i] = temp;
        }
    }
    return matrix;
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

    int[,] randomMatrix = IntMatrixRandomizer(3, 3, randomMinValue, randomMaxValue);
    PrintMatrix(randomMatrix);
    Console.WriteLine("----------------------------------------------------");
    if (randomMatrix.GetLength(0) == randomMatrix.GetLength(1))
    {
        IntMatrixLinesToColumnsChanger(randomMatrix);
        PrintMatrix(randomMatrix);
    }
    else Console.WriteLine("Это сделать невозможно");

    Console.Write("Повторить? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}



// // 002. Метод замены столбцов на строки через создание новой матрицы.
// int[,] ChangePlace(int[,] arr)
// {
//     int[,] arrResult = new int[arr.GetLength(0), arr.GetLength(1)];
//     for (int i = 0; i < arr.GetLength(0); i++)
//     {
//         for (int j = 0; j < arr.GetLength(1); j++)
//         {
//             arrResult[i, j] = arr[j, i];
//         }
//     }
//     return arrResult;
// }
