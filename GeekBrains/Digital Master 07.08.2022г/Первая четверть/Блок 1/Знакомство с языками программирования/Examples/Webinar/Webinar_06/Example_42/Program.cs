// Задача 42. Напишите программу, которая будет преобразовывать десятичное число в двоичное.
// 45 -> 101101
// 3 -> 11
// 2 -> 10

// Метод перевода числа из десятичной системы счисления в двоичную.
int DecimalToBinaryConverter(int divident)
{
    int binaryNumber = default,
        multiplier = 1;

    while (divident != 0)
    {
        binaryNumber += (divident % 2) * multiplier;
        divident /= 2;
        multiplier *= 10;
    }

    return binaryNumber;
}

// Начало программы.
// Переменная restart bool типа нужна для определения перезапуска программы.
bool restart = true;
// Пока restart принимает значение true, выполняется тело цикла.
while (restart)
{
    // Очистка консоли (убираем с экрана предыдущие выводы в консоль).
    Console.Clear();
    // Блок объявления переменных.
    Random randomizer = new Random();
    int decimalNumber = randomizer.Next(0, 100),
        result = default;
    // Блок вывода информации в консоль и передачи данных в метод.
    Console.WriteLine($"Число {decimalNumber} в двоичной системе счисления ");
    result = DecimalToBinaryConverter(decimalNumber);
    Console.WriteLine($"будет выглядеть так: {result}");
    // Подтверждение перезапуска тела цикла программы.
    Console.Write("Повторить? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}
// Конец.