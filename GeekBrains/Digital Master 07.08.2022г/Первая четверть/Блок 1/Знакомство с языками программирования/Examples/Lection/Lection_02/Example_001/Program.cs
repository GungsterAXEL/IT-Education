// Нахождение максимального из девяти чисел.
Console.Clear(); // Очистка консоли.
int Max(int arg1, int arg2, int arg3) // Функция Max. Принимает три аргумента.
{
    int result = arg1; // Начальный аргумент.
    if (arg2 > result) result = arg2; // Условие для изменения результата.
    if (arg3 > result) result = arg3; // Условие для изменения результата.
    return result; // Результат
}

// Статические переменные, можно осуществить ввод с клавиатуры.
int a1 = 1222;
int b1 = 223;
int c1 = 31;
int a2 = 49999;
int b2 = 52;
int c2 = 6;
int a3 = 79999;
int b3 = 8;
int c3 = 9999;

// Закоментированные строки - вариант решения стихийным методом.
// int max = a1;
// if (b1 > max) max = b1;
// if (c1 > max) max = c1;

// if (a2 > max) max = a2;
// if (b2 > max) max = b2;
// if (c2 > max) max = c2;

// if (a3 > max) max = a3;
// if (b3 > max) max = b3;
// if (c3 > max) max = c3;

// int max1 = Max(a1, b1, c1);
// int max2 = Max(a2, b2, c2);
// int max3 = Max(a1, b3, c3);
// int max = Max(max1, max2, max3);
// Вариант записи предыдущих четырёх строчек в одной:
int max = Max(Max(a1, b1, c1), Max(a2, b2, c2), Max(a3, b3, c3));

Console.WriteLine(max); // Вывод результатов выполнения функции (метода).