Console.Clear();
// S1.4. Составить программу вывода на экран числа, вводимого с клавиатуры.
// После выводимого числа должно следовать сообщение » — вот какое число Вы  ввели».

Console.WriteLine("Задача S1.4:");
Console.Write("Введите число: ");
int n = Convert.ToInt32(Console.ReadLine());
Console.WriteLine($"{n} - вот какое число Вы ввели.");

// S1.5. Вывести на одной строке числа 1, 13 и 49 с одним пробелом между ними.

Console.WriteLine(" ");
Console.WriteLine("Задача S1.5:");
int a = 1, b = 13, c = 49;
Console.WriteLine($"{a} {b} {c}");

// S1.6. Вывести на одной строке числа 7, 15 и 100 с двумя пробелами между ними.

Console.WriteLine(" ");
Console.WriteLine("Задача S1.6:");
int a1 = 7, b1 = 15, c1 = 100;
Console.WriteLine($"{a1}  {b1}  {c1}");

// S1.7. Составить программу вывода на экран в одну строку трех любых чисел с двумя пробелами между ними.

Console.WriteLine(" ");
Console.WriteLine("Задача S1.7:");
Random r2 = new Random(); // class System.Random - псевдо генерация случайного числа.
int a2 = r2.Next(0, 10);   // r.Next(0, 10) - присвоение переменной a значения от 0 !ДО! 10.
int b2 = r2.Next(0, 10);   // В данном примере максимальное значение для переменной будет равно 9.
int c2 = r2.Next(0, 10);
Console.WriteLine($"{a2}  {b2}  {c2}");

// S1.8. Составить программу вывода на экран в одну строку четырех любых чисел  с одним пробелом между ними.

Console.WriteLine(" ");
Console.WriteLine("Задача S1.8:");
Random r3 = new Random();
int a3 = r3.Next(0, 100), b3 = r3.Next(0, 100),
c3 = r3.Next(0, 100), d3 = r3.Next(0, 100);
Console.WriteLine($"{a3} {b3} {c3} {d3}");

// S1.9. Вывести на экран числа 50 и 10 одно под другим.

Console.WriteLine(" ");
Console.WriteLine("Задача S1.9:");
int a4 = 50, b4 = 10;
// Console.WriteLine(a4);
// Console.WriteLine(b4);
Console.WriteLine($"{a4}\n{b4}"); // "\n" - управляющий символ, перемещает позицию курсора на одну строку вниз в начало строки.

// S1.10. Вывести на экран числа 5, 10 и 21 одно под другим.

Console.WriteLine(" ");
Console.WriteLine("Задача S1.10:");
int a5 = 5, b5 = 10, c5 = 21;
Console.WriteLine($"{a5}\n{b5}\n{c5}");

// S1.11. Составить программу вывода на экран «столбиком» четырех любых чисел.

Console.WriteLine(" ");
Console.WriteLine("Задача S1.11:");
Random r1_11 = new Random();
int a1_11 = r1_11.Next(0, 55), b1_11 = r1_11.Next(0, 55),
    c1_11 = r1_11.Next(0, 55), d1_11 = r1_11.Next(0, 55);
Console.WriteLine($"{a1_11}\n{b1_11}\n{c1_11}\n{d1_11}");

// S1.12. Составить программу вывода на экран следующей информации:
// 5 10
// 7 см

Console.WriteLine(" ");
Console.WriteLine("Задача S1.12:");
int a1_12 = 5, b1_12 = 10,
    c1_12 = 7;
string d1_12 = "см";
Console.WriteLine($"{a1_12} {b1_12}\n{c1_12} {d1_12}");

// S1.13. Составить программу вывода на экран следующей информации:
// 2 кг
// 13 17

Console.WriteLine(" ");
Console.WriteLine("Задача S1.13:");
int a1_13 = 2,c1_13 = 13,d1_13 = 17;
string b1_13 = "кг";
Console.WriteLine($"{a1_13} {b1_13}\n{c1_13} {d1_13}");