// Задача 41. Пользователь вводит с клавиатуры M чисел.
// Посчитайте, сколько чисел больше 0 ввёл пользователь.
// 0, 7, 8, -2, -2 -> 2
// 1, -7, 567, 89, 223-> 3

// Описание методов:
// Метод печати массива.
void ArrayPrint(int[] array)
{
    Console.Write("[");
    for (int i = 0; i < array.Length; i++)
    {
        if (i < array.Length - 1) Console.Write($"{array[i]}, ");
        else Console.Write($"{array[i]}]");
    }
}
// Метод ручного ввода значений в массив (с проверкой на int).
int[] IntArrayFilling(int size)
{
    int[] array = new int[size];
    for (int i = 0; i < array.Length; i++)
    {
        Console.Write($"Введите {i + 1}е число: ");
        while (!int.TryParse(Console.ReadLine(), out array[i]))
        {
            Console.Write($"Ошибка ввода. \nВведите {i + 1}е число: ");
        }
    }
    return array;
}
// Метод поиска значений элементов массива больше ноля.
int HigherThanZeroFinder(int[] array)
{
    int count = default;
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i] > 0) count++;
    }
    return count;
}

// Начало.
bool restart = true;
// Цикл перезапуска.
while (restart)
{
    // Очистка консоли.
    Console.Clear();
    // Объявление переменных. Не совсем понятно стоит ли объявлять переменную result здесь?
    int arraySize = default;
    int result = default;
    // Проверка ввода на int значение с записью в переменную arraySize. Сам цикл начинается на 54й строке кода.
    Console.Write("Сколько чисел будем вводить? ");
    while (!int.TryParse(Console.ReadLine(), out arraySize) || arraySize < 0)
    {
        Console.Write("Ошибка ввода. \nСколько чисел будем вводить? ");
    }
    // Объявление массива и заполнение его через метод ручного ввода значений.
    int[] newArray = IntArrayFilling(arraySize);
    // Печать получившегося массива.
    ArrayPrint(newArray);
    // Присвоение переменной result значение переменной count из метода по поиску нужных значений.
    result = HigherThanZeroFinder(newArray);
    // Вывод количества совпадений на экран.
    Console.Write($" -> {result} совпадений с числами больше ноля.");
    // Запрос перезапуска.
    Console.Write("\nПовторить? \n'Enter' - Да. Что-то другое - Выход.");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}
// Конец.