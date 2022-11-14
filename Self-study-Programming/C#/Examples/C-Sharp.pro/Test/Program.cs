Console.Clear();

double e = Math.PI; // Math.PI - вывод числа Пи через математический модуль.
Console.WriteLine($"{e:N19}"); // {e:N2} - такая запись позволяет сократить переменную e до N знаков после запятой.

Random rnd = new Random();
Console.WriteLine("{0} {1} {2}", rnd.Next(), rnd.Next(), rnd.Next()); // - Вывод случайных чисел может быть и таким.

// Math.Pow(x,y); Где x - число, возводимое в степень, y - число, задающее степень.

// Зацикливание выполнения программы до нажатия клавиши Enter:
bool proceed = true;
while (proceed)
{

    Console.WriteLine("\nНажмите 'Enter' для повтора или другую клавишу для выхода: ");
    proceed = Console.ReadKey().Key == ConsoleKey.Enter;
}
// ^^^ Зацикливание выполнения программы до нажатия клавиши Enter.^^^

// Проверка и зацикливание ввода числа пользователем.
int n = 0;
Console.Write("Введите число: ");
while (!int.TryParse(Console.ReadLine(), out n))
{
    Console.Write("Ошибка ввода, введите число: ");
}
// ^^^ Проверка и зацикливание ввода числа пользователем.^^^