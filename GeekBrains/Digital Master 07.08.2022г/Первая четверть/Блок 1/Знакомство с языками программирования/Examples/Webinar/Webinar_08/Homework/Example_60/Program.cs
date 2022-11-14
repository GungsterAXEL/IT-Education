// Задача 60. Сформируйте трёхмерный массив из неповторяющихся двузначных чисел.
// Напишите программу, которая будет построчно выводить массив, добавляя индексы каждого элемента.
// Массив размером 2 x 2 x 2
// 66(0,0,0) 27(0,0,1) 25(0,1,0) 90(0,1,1)
// 34(1,0,0) 26(1,0,1) 41(1,1,0) 55(1,1,1)

int[,,] IntCubeFiller(int width, int height, int depth)
{
    Random random = new Random();
    int n = random.Next(10, 30);
    int[,,] cube = new int[width, height, depth];
    for (int i = 0; i < width; i++)
    {
        for (int j = 0; j < height; j++)
        {
            for (int k = 0; k < depth; k++)
            {
                cube[i, j, k] = n;
                n++;
            }
        }
    }
    return cube;
}

int[,,] IntCubeShaker(int[,,] cube)
{
    Random random = new Random();

    for (int i = 0; i < cube.GetLength(0); i++)
    {
        for (int j = 0; j < cube.GetLength(1); j++)
        {
            for (int k = 0; k < cube.GetLength(2); k++)
            {
                int iCoordinate = random.Next(0, cube.GetLength(0)),
                    jCoordinate = random.Next(0, cube.GetLength(1)),
                    kCoordinate = random.Next(0, cube.GetLength(2)),
                    temp = cube[i, j, k];
                cube[i, j, k] = cube[iCoordinate, jCoordinate, kCoordinate];
                cube[iCoordinate, jCoordinate, kCoordinate] = temp;
            }
        }
    }
    return cube;
}

void CubePrinter(int[,,] cube)
{
    Console.WriteLine($"Массив {cube.GetLength(0)} x {cube.GetLength(1)} x {cube.GetLength(2)}.");
    for (int i = 0; i < cube.GetLength(0); i++)
    {
        for (int j = 0; j < cube.GetLength(1); j++)
        {
            for (int k = 0; k < cube.GetLength(2); k++)
            {
                Console.Write($"{cube[i, j, k]}({i},{j},{k}) ");
            }
        }
        Console.WriteLine();
    }
}

bool restart = true;
while (restart)
{
    Console.Clear();

    Random randomizer = new Random();
    int randomWidth = randomizer.Next(1, 5),
        randomHeight = randomizer.Next(1, 5),
        randomDepth = randomizer.Next(1, 5);

    int[,,] randomCube = IntCubeFiller(randomWidth, randomHeight, randomDepth);
    randomCube = IntCubeShaker(randomCube);
    CubePrinter(randomCube);

    Console.Write("Повторить? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}