// // 001. Первый вариант. Работает через подстановку курсора в нужное место экрана.
// // Работает со значениями +-15 и рисует ось максимум 30 на 30.
// // Считает расстояние между двумя точками.
// // Console.SetCursorPosition(x, y); - где х отступ слева от левого края экрана, а у от верхнего.
// // Console.WriteLine("+"); - нужные точки обозначаем знаком "+".
// int x1 = 0, y1 = 0,
// x2 = 0, y2 = 0;
// do
// {
//     Console.Clear();
//     Console.WriteLine("Данная ось умеет работать только с диапазоном значений от -15 до 15.");
//     // Запрос координат двух точек от пользователя:
//     Console.Write("Представьте координаты точки А по оси Х: ");
//     while (!int.TryParse(Console.ReadLine(), out x1))
//     {
//         Console.Write("Ошибка ввода. \nПредставьте координаты точки А по оси Х: ");
//     }

//     Console.Write("Представьте координаты точки А по оси Y: ");
//     while (!int.TryParse(Console.ReadLine(), out y1))
//     {
//         Console.Write("Ошибка ввода. \nПредставьте координаты точки А по оси Y: ");
//     }

//     Console.Write("Представьте координаты точки B по оси Х: ");
//     while (!int.TryParse(Console.ReadLine(), out x2))
//     {
//         Console.Write("Ошибка ввода. \nПредставьте координаты точки B по оси Х: ");
//     }

//     Console.Write("Представьте координаты точки B по оси Y: ");
//     while (!int.TryParse(Console.ReadLine(), out y2))
//     {
//         Console.Write("Ошибка ввода. \nПредставьте координаты точки B по оси Y: ");
//     }
// }
// while (x1 > 15 || y1 > 15 || x2 > 15 || y2 > 15 || x1 < -15 || y1 < -15 || x2 < -15 || y2 < -15);
// // Обозначаем ось координат:
// int xa = 30, ya = 1,
//     xb = 60, yb = 15,
//     xc = 30, yc = 30,
//     xd = 1, yd = 15;
// // Рисуем края оси координат: ║  ═  ╬  ¤
// Console.SetCursorPosition(xa, ya);
// Console.Write("^y");
// Console.SetCursorPosition(xb, yb);
// Console.Write(">x");
// Console.SetCursorPosition(xc, yc);
// Console.Write("-y");
// Console.SetCursorPosition(xd, yd);
// Console.Write("-x");

// void XYCoordinateAxis(int x, int y)
// {
//     x = 2; y = 15;
//     do
//     {
//         x++;
//         Console.SetCursorPosition(x, y);
//         Console.Write("═");
//     }
//     while (x != 59);
//     x = 30; y = 1;
//     do
//     {
//         y++;
//         Console.SetCursorPosition(x, y);
//         Console.Write("║");
//     }
//     while (y != 29);
//     x = 30; y = 15;
//     Console.SetCursorPosition(x, y);
//     Console.Write("╬");
// }
// XYCoordinateAxis(xd, yb);

// void ABVisualisation(int x1_1, int y1_1, int x2_1, int y2_1)
// {
//     x1_1 = 30 + x1_1 * 2;
//     y1_1 = 15 - y1_1;
//     Console.SetCursorPosition(x1_1, y1_1);
//     Console.Write("¤a");
//     x2_1 = 30 + x2_1 * 2;
//     y2_1 = 15 - y2_1;
//     Console.SetCursorPosition(x2_1, y2_1);
//     Console.Write("¤b");
// }
// ABVisualisation(x1, y1, x2, y2);

// double AB2Distance(int x1_2, int y1_2, int x2_2, int y2_2)
// {
//     double distance = (x2_2 - x1_2) * (x2_2 - x1_2) + (y2_2 - y1_2) * (y2_2 - y1_2);
//     return Math.Round(Math.Sqrt(distance), 2, MidpointRounding.ToZero);
// }
// Console.Write($" {AB2Distance(x1, y1, x2, y2)}");

// 002. Более удобный вариант. Работает на двумерном массиве.
// Рисует ось до 100 на 100 пунктов.
// Считает расстояние между двумя точками. Автоматически подбирает нужный размер оси для визуализации.
// ╬ ║ ═ ░ ▲ ► ¤
void CAxisPrinter(int[,] matrix,int aX, int aY, int bX, int bY)
{
    int lines = matrix.GetLength(0),
        columns = matrix.GetLength(1);
    Console.Write("     ");
    Console.WriteLine(new string('-', columns*2+1));
    for (int i = 0; i < lines; i++)
    {
        Console.Write("     |");
        for (int j = 0; j < columns; j++)
        {
            Console.ForegroundColor = ConsoleColor.Green;
            if (j== columns / 2 + aX && i == lines / 2 - aY)
            {
	            Console.ForegroundColor = ConsoleColor.Red;
	            Console.Write("¤A");
	            Console.ResetColor();
            }
            else if (j == columns / 2 + bX && i == lines / 2 - bY)
            {
	            Console.ForegroundColor = ConsoleColor.Red;
	            Console.Write("¤B");
	            Console.ResetColor();
            }
            else if (i == lines / 2 && j == columns / 2) Console.Write("╬");
            else if (i == 0 && j == columns / 2) Console.Write("▲");
            else if (i == lines / 2 && j == columns - 1) Console.Write("►x");
            else if (i == lines / 2) Console.Write("══");
            else if (j == columns / 2) Console.Write("║");
            else
            {
	            Console.ResetColor();
	            Console.Write("░░");
            }
        }
        Console.ResetColor();
        Console.WriteLine("|");
    }
    Console.Write("     ");
    Console.WriteLine(new string('-', columns*2+1));
}

int UserInsert(int coordinate, string message)
{
    Console.Write(message);
    while(!int.TryParse(Console.ReadLine(),out coordinate))
        {
        Console.Write($"Ошибка ввода. \n{message}");
        }
    return coordinate;
}

int CAxisAutoSizer(int aX, int aY, int bX, int bY)
{
    if(aX < 0) aX = -aX;
    if(aY < 0) aY = -aY;
    if(bX < 0) bX = -bX;
    if(bY < 0) bY = -bY;
    int[]array = {aX,aY,bX,bY};
    int autosize = array[0];
    for (int i = 1; i < array.Length; i++)
    {
        if(array[i] > autosize) autosize = array[i];
    }
    autosize = autosize * 2 + 1;
    return autosize;
}

 double AB2Distance(int aX, int aY, int bX, int bY)
 {
	 double distance = (bX - aX) * (bX - aX) + (bY - aY) * (bY - aY);
    return Math.Round(Math.Sqrt(distance), 2, MidpointRounding.ToZero);
 }

bool restart = true;
while (restart)
{
    Console.Clear();
	int size = default,
        dotAx = default,
		dotAy = default,
        dotBx = default,
        dotBy = default;
	dotAx = UserInsert(dotAx, "     Введите координату точки А по Х: ");
	dotAy = UserInsert(dotAy, "     Введите координату точки А по Y: ");
	dotBx = UserInsert(dotBx, "     Введите координату точки B по X: ");
	dotBy = UserInsert(dotBy, "     Введите координату точки B по Y: ");

	size = CAxisAutoSizer(dotAx, dotAy, dotBx, dotBy);
	Console.WriteLine($"     Максимально необходимый размер оси {size}x{size}.");
	int[,] caxis = new int[size, size];

	if (size < 100) CAxisPrinter(caxis, dotAx, dotAy, dotBx, dotBy);
    else Console.WriteLine("     !!Визуализации не будет, ось слишком большая!!");
	double ab2DistanseResult = AB2Distance(dotAx, dotAy, dotBx, dotBy);
	Console.WriteLine($"     Расстояние между точками A и B = {ab2DistanseResult:f2}.");

    Console.Write("\n     Enter - Заново. Что-то другое - Выход.");
	restart = Console.ReadKey().Key == ConsoleKey.Enter;
}