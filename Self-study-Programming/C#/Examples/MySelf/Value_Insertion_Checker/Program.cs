Console.Clear();

// // 001. Проверка ввода в определённом диапазоне.
// // Если ввести не цифру - всё сломается.
// int n;
// do
// {
//     Console.Write("Введите трёхзначное целое число: ");
//     n = Convert.ToInt32(Console.ReadLine());
// }
// while (n < 100 && n > -100 || n < -999 || n > 999);
// Console.WriteLine(n);



// // 002. Проверка ввода нужного типа данных.
// // В скобки к условию можно дописать необходимый диапазон.
// int num;
// Console.Write("Введите целое число: ");
// while (!int.TryParse(Console.ReadLine(), out num))
// {
//     Console.Write("Ошибка ввода. \nВведите целое число: ");
// }
// Console.WriteLine(num);



// // 003. Метод введения нужных значений вручную с проверкой ввода.
// // !!Вариант с повторяющимся кодом!!
// void ValueInsertion(out double a1, out double c1, out double b1, out double d1)
// {
//     Console.WriteLine("Введите необходимые значения для прямых:");
//     // y = k1 * x + b1, y = k2 * x + b2
//     Console.WriteLine("y = ax + c, y = bx + d");

//     Console.Write("Введите a: ");
//     while (!double.TryParse(Console.ReadLine(), out a1))
//     {
//         Console.Write("Ошибка ввода. Введите a: ");
//     }

//     Console.Write("Введите c: ");
//     while (!double.TryParse(Console.ReadLine(), out c1))
//     {
//         Console.Write("Ошибка ввода. Введите c: ");
//     }

//     Console.Write("Введите b: ");
//     while (!double.TryParse(Console.ReadLine(), out b1))
//     {
//         Console.Write("Ошибка ввода. Введите b: ");
//     }

//     Console.Write("Введите d: ");
//     while (!double.TryParse(Console.ReadLine(), out d1))
//     {
//         Console.Write("Ошибка ввода. Введите d: ");
//     }
// }
// double a, b, c, d;
// ValueInsertion(out a, out b, out c, out d);
// Console.WriteLine($"{a}, {b}, {c}, {d}.");



// // 004. Метод проверки ввода нужного типа данных.
// // Работает с массивом, ограниченным 4мя элементами.
// double[] ArrayValueInsertion(double[] array)
// {
//     Console.WriteLine("Введите необходимые значения для прямых:");
//     Console.WriteLine("y = ax + c, y = bx + d");

//     for (int i = 0; i < array.Length; i++)
//     {
//         if (i == 0) Console.Write("Введите а: ");
//         else if (i == 1) Console.Write("Введите с: ");
//         else if (i == 2) Console.Write("Введите b: ");
//         else Console.Write("Введите d: ");

//         while (!double.TryParse(Console.ReadLine(), out array[i]))
//         {
//             Console.Write("Ошибка ввода.");
//             if (i == 0) Console.Write("Введите а: ");
//             else if (i == 1) Console.Write("Введите с: ");
//             else if (i == 2) Console.Write("Введите b: ");
//             else Console.Write("Введите d: ");
//         }
//     }
//     return array;
// }

// double[] arr = new double[4];
// ArrayValueInsertion(arr);
// Console.WriteLine($"{arr[0]}, {arr[1]}, {arr[2]}, {arr[3]}.");



// // 005. Метод проверки ввода нужного типа данных.
// // Запрос о вводе выводится до самого ввода.
// // Не выводит сообщение об ошибке ввода.
// double x;
// void ValueInsertionMethod(out double x1)
// {
//     do
//     {
//         Console.Write("Введите х: ");
//     } while (!double.TryParse(Console.ReadLine(), out x1));
// }
// ValueInsertionMethod(out x);
// Console.WriteLine(x);



// // 006. Метод проверки ввода нужного типа данных.
// // Выводит нужное сообщение, для нужной переменной.
// double x = default;
// double ValueInsertionMethod(double x1, string message)
// {
//     Console.Write(message);
//     while (!double.TryParse(Console.ReadLine(), out x1))
//     {
//         Console.Write($"Ошибка ввода. {message}");
//     }
//     return x1;
// }
// x = ValueInsertionMethod(x, "Введите х: ");
// Console.WriteLine(x);



// // 007. Рекурсивный метод проверки ввода.
// double x = default;
// double ValueInsertionMethod(double x1, string message)
// {
//     Console.Write(message);
//     while (!double.TryParse(Console.ReadLine(), out x1))
//     {
//         Console.Write($"Ошибка ввода. {message}");
//     }
//     if (x1 < 0)
//     {
//         Console.WriteLine("Нужно вводить положительное число!");
//         x1 = ValueInsertionMethod(x1, message);
//     }
//     return x1;
// }
// x = ValueInsertionMethod(x, "Введите х: ");
// Console.WriteLine(x);



// 008. Проверка на ввод пустой строки.
string UserInput(string text, string message)
{
    Console.WriteLine(message);
    while (string.IsNullOrWhiteSpace(text = Console.ReadLine()))
    {
        Console.WriteLine($"Строка не должна быть пустой!\n{message}");
    }
    return text;
}
string userText = string.Empty;
userText = UserInput(userText, "Введите текст:");