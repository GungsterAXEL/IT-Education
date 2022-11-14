// Задача 54. Задайте двумерный массив.
// Напишите программу, которая упорядочит по убыванию элементы каждой строки двумерного массива.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4

// В итоге получается вот такой массив:
// 7 4 2 1
// 9 5 3 2
// 8 4 4 2

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

void PrintMatrix(int[,] matrix)
{
    int lines = matrix.GetLength(0),
    columns = matrix.GetLength(1);
    Console.WriteLine(new string('-', columns * 5 + 2));
    for (int i = 0; i < lines; i++)
    {
        Console.Write("|");
        for (int j = 0; j < columns; j++)
        {
            Console.Write($"{matrix[i, j],5}");
        }
        Console.WriteLine("|");
    }
    Console.WriteLine(new string('-', columns * 5 + 2));
}

// // Пузырьковый метод.
// void SortMatrixLines(int[,] matrix)
// {
//     int lines = matrix.GetLength(0),
//         columns = matrix.GetLength(1),
//         temp = matrix[0, 0];
// Console.WriteLine("Сейчас отсортируем каждую строку...");
//     for (int i = 0; i != lines; i++)
//     {
//         for (int j = 0; j != columns; j++)
//         {
//             int maxValuePosition = j;
//             for (int index = j + 1; index != columns; index++)
//             {
//                 if (matrix[i, index] > matrix[i, maxValuePosition])
//                 {
//                     maxValuePosition = index;
//                 }
//             }
//             temp = matrix[i, j];
//             matrix[i, j] = matrix[i, maxValuePosition];
//             matrix[i, maxValuePosition] = temp;
//         }
//     }
// }

// Попытка изобразить что-то другое.
void SortMatrixLines(int[,] matrix)
{
    int lines = matrix.GetLength(0),
        columns = matrix.GetLength(1),
        max = matrix[0, 0],
        temp = matrix[0, 0];
    Console.WriteLine("Сейчас отсортируем каждую строку...");
    for (int count = 0; count < columns; count++)
    {
        for (int i = 0; i != lines; i++)
        {
            for (int j = 0; j != columns - 1; j++)
            {
                if (matrix[i, j] < matrix[i, columns - 1])
                {
                    temp = matrix[i, j];
                    max = matrix[i, columns - 1];
                    matrix[i, j] = max;
                    matrix[i, columns - 1] = temp;
                }

                if (matrix[i, j] < matrix[i, j + 1])
                {
                    temp = matrix[i, j];
                    max = matrix[i, j + 1];
                    matrix[i, j] = max;
                    matrix[i, j + 1] = temp;
                }

            }
        }
    }
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
    PrintMatrix(randomMatrix);
    if (randomMatrix.GetLength(1) == 1) Console.WriteLine("Нечего сортировать!");
    else
    {
        SortMatrixLines(randomMatrix);
        PrintMatrix(randomMatrix);
    }

    Console.Write("Продолжить? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}