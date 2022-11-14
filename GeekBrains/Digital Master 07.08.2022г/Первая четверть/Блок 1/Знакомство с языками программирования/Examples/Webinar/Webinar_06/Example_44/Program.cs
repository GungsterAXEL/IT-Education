// Задача 44. Не используя рекурсию, выведите первые N чисел Фибоначчи.

// Первые два числа Фибоначчи: 0 и 1.
// Если N = 5 -> 0 1 1 2 3
// Если N = 3 -> 0 1 1
// Если N = 7 -> 0 1 1 2 3 5 8

// Метод вывода последовательности Фибоначчи. Решение с семинара.
// void Fibonacci(int fN)
// {
//     int f0 = 0;
//     int f1 = 1;
//     int result = default;
//     Console.Write($"{f0} {f1} ");
//     for (int i = 2; i < fN; i++)
//     {
//         result = f0 + f1;
//         Console.Write($"{result} ");
//         f0 = f1;
//         f1 = result;
//     }
// }

// Функция заполнения массива значениями последовательности Фибоначчи.
void FibonacciArray(int[] array)
{
    // Первое и второе число последовательности Фибоначчи уже известны.
    array[0] = 0;
    array[1] = 1;
    // Формула нахождения остальных чисел.
    // f(n) = f(n-1) + f(n-2)
    for (int i = 2; i < array.Length; i++)
    {
        array[i] = array[i - 1] + array[i - 2];
    }
}
// Печать массива.
void PrintArray(int[] array)
{
    Console.WriteLine($"Последовательность первых {array.Length} чисел Фибоначчи: ");

    for (int i = 0; i < array.Length; i++)
    {
        Console.WriteLine($"{i + 1}е число из последовательности Фибоначчи = {array[i]}.");
    }
}

// Начало.
// Ну куда же без перезапуска? Очень удобная штука, научился один раз и пользуюсь всегда.
bool restart = true;
while (restart)
{
    // Очистка консоли.
    Console.Clear();
    // Объявление переменных
    Random randomizer = new Random();
    int fibonacci = randomizer.Next(2, 10);
    int[] fibonacciSeries = new int[fibonacci];
    // Использование функций.
    FibonacciArray(fibonacciSeries);
    PrintArray(fibonacciSeries);
    // Подтверждение перезапуска.
    Console.Write("\nПовторить? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}
// Конец.