// Задача 40. Напишите программу, которая принимает на вход три числа
// и проверяет, может ли существовать треугольник со сторонами такой длины.
// Теорема о неравенстве треугольника: каждая сторона треугольника
// меньше суммы двух других сторон.

// Метод проверки теоремы о неравенстве треугольника.
void TriangleInequalityChecker(int hip1, int hip2, int hip3)
{
    if (hip1 < hip2 + hip3 && hip2 < hip1 + hip3 && hip3 < hip1 + hip2)
    {
        Console.Write("Такой треугольник может существовать.");
    }
    else Console.Write("Такой треугольник не может существовать.");
}
// Начало.
bool restart = true;
// Начало зацикливания выполнения программы.
while (restart)
{
    Console.Clear();
    // Объявление переменных для программы.
    int hipAB = default,
        hipBC = default,
        hipCA = default;
    // Проверка ввода целочисленного значения для переменной hipAB.
    Console.Write("Введите предполагаемую длину стороны AB треугольника: ");
    while (!int.TryParse(Console.ReadLine(), out hipAB))
    {
        Console.Write("Ошибка ввода. \nВведите предполагаемую длину стороны AB треугольника: ");
    }
    // Проверка ввода целочисленного значения для переменной hipBC.    
    Console.Write("Введите предполагаемую длину стороны BC треугольника: ");
    while (!int.TryParse(Console.ReadLine(), out hipBC))
    {
        Console.Write("Ошибка ввода. \nВведите предполагаемую длину стороны BC треугольника: ");
    }
    // Проверка ввода целочисленного значения для переменной hipCA.    
    Console.Write("Введите предполагаемую длину стороны CA треугольника: ");
    while (!int.TryParse(Console.ReadLine(), out hipCA))
    {
        Console.Write("Ошибка ввода. \nВведите предполагаемую длину стороны CA треугольника: ");
    }
    // Обращение к методу.
    TriangleInequalityChecker(hipAB, hipBC, hipCA);
    // Запрос на повтор выполнения программы.
    Console.Write("\nПовторить? \n'Enter' - Да. Что-то другое - Выход");
    restart = Console.ReadKey().Key == ConsoleKey.Enter;
}
// Конец.