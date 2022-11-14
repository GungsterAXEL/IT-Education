// Задача 50. Напишите программу, которая на вход принимает позиции элемента в двумерном массиве,
// и возвращает значение этого элемента или же указание, что такого элемента нет.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 17 -> такого числа в массиве нет

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
int UserCoordinateToFind(int coordinateToFind, string message)
{
    Console.Write(message);
    while (!int.TryParse(Console.ReadLine(), out coordinateToFind))
    {
        Console.Write($"Ошибка ввода. \n{message}");
    }
    return coordinateToFind;
}
void UserCoordinateFinder(int[,] matrix, (int, int) coordinateToFind)
{
    int iCoordinate = coordinateToFind.Item1,
        jCoordinate = coordinateToFind.Item2;
    if (matrix.GetLength(0) >= iCoordinate && matrix.GetLength(1) >= jCoordinate)
    {
        Console.WriteLine($"Есть совпадение с координатами {coordinateToFind} -> Число {matrix[iCoordinate, jCoordinate]}.");
    }
    else
    {
        Console.WriteLine($"Совпадений с координатами {coordinateToFind} не нашлось.");
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
    (int, int) userCoordinateToFind = default;

    int[,] randomMatrix = IntMatrixRandomizer(randomLines, randomColumns, randomMinValue, randomMaxValue);
    PrintMatrix(randomMatrix);
    userCoordinateToFind.Item1 = UserCoordinateToFind(userCoordinateToFind.Item1, "Введите идентификатор строки: ");
    userCoordinateToFind.Item2 = UserCoordinateToFind(userCoordinateToFind.Item2, "Введите идентификатор столбца: ");
    UserCoordinateFinder(randomMatrix, userCoordinateToFind);

    Console.Write("Повторить? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}