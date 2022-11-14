// Задача 57: Составить частотный словарь элементов
// двумерного массива. Частотный словарь содержит
// информацию о том, сколько раз встречается элемент
// входных данных.


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
int[] IntMatrixToArrayChanger(int[,] matrix)
{
    int[] array = new int[matrix.GetLength(0) * matrix.GetLength(1)];
    int k = default;
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            array[k] = matrix[i, j];
            k++;
        }
    }
    Array.Sort(array);
    return array;
}
void ArrayPrint(int[] array)
{
    Console.Write("[");
    for (int i = 0; i < array.Length; i++)
    {
        if (i < array.Length - 1) Console.Write($"{array[i]}, ");
        else Console.WriteLine($"{array[i]}]");
    }
}
void MatchFinder(int[] array)
{
    int temp = array[0];
    int count = 1;
    for (int i = 1; i < array.Length; i++)
    {
        if (temp != array[i])
        {
            Console.WriteLine($"{temp, 4} встречается {count,2} раз.");
            temp = array[i];
            count = 1;
        }
        else
        {
            count++;
        }
    }
    Console.WriteLine($"{temp} встречается {count} раз.");
}

bool restart = true;
while (restart)
{

    Console.Clear();

    Random randomizer = new Random();
    int randomLines = randomizer.Next(1, 11),
        randomColumns = randomizer.Next(1, 11),
        randomMinValue = randomizer.Next(-100, 0),
        randomMaxValue = randomizer.Next(0, 100);

    int[,] randomMatrix = IntMatrixRandomizer(randomLines, randomColumns, randomMinValue, randomMaxValue);
    PrintMatrix(randomMatrix);
    int[] matrixArray = IntMatrixToArrayChanger(randomMatrix);
    ArrayPrint(matrixArray);
    MatchFinder(matrixArray);

    Console.Write("Повторить? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}