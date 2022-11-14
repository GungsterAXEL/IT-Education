// Рисуем фрактальное изображение - Треугольник Серпинского.
Console.Clear(); // Очистка консоли
// Console.SetCursorPosition(x, y); - где х отступ слева от левого края экрана, а у от верхнего.
// Console.WriteLine("+"); - нужные точки обозначаем знаком "+".
// Обозначаем вершины треугольника:
int xa = 38, ya = 1, // Вершина а.
    xb = 1, yb = 38, // Вершина b.
    xc = 76, yc = 38; // Вершина с.
// Рисуем вершины треугольника:
Console.SetCursorPosition(xa,ya);
Console.WriteLine(".");
Console.SetCursorPosition(xb,yb);
Console.WriteLine(".");
Console.SetCursorPosition(xc,yc);
Console.WriteLine(".");

int x = xa, y = xb; // Стартовая позиция
int count = 0; // Счётчик
while(count < 100000) // Пока счётчик меньше
{
    int what = new Random().Next(0,3); // Рандомное число от 0 до 2 (стартовое значение 0, разброс в 3 цифры). 0, 1, и 2.
    if(what == 0) //Если наше рандомное число = 0, то:
    {
        x = (x + xa) / 2;
        y = (y + ya) / 2;
    }

    if(what == 1) // А если = 1, то:
    {
        x = (x + xb) / 2;
        y = (y + yb) / 2;
    }

       if(what == 2) // Если = 2, то:
    {
        x = (x + xc) / 2;
        y = (y + yc) / 2;
    }
// Пока условие цикла while выполняется:
    Console.SetCursorPosition(x, y); // Курсор будет устанавливаться в данную позизию.
    Console.WriteLine("."); // И писать там точку.
    count++; // Счётчик будет увеличиваться на единицу после всех действий.
}// Конец программы.