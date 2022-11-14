Console.Clear();
// Виды методов.
// Вид 1:
void Method1() //Пустой метод. Ничего не принимает, ничего не возвращает.
{
    Console.WriteLine("Автор ..."); // Вывод сообщения.
}
Method1(); //Вызов метода.
Console.WriteLine();



//Вид 2: ничего не возвращают, но принимают какие-то аргументы.
void Method2(string msg)
{
    Console.WriteLine(msg);
}
Method2(msg: "Текст сообщения"); // msg: именованный аргумент(принимает заданное значение).
Console.WriteLine();

void Method2_1(string msg, int count)
{
    int i = 0;
    while (i < count)
    {
        Console.WriteLine(msg);
        i++;
    }
}
Method2_1("Текст", 4); // Вывод текста 4 раза.
Method2_1(count: 4, msg: "Новый текст"); // Для именованных аргументов не обязательно использование по порядку.
Console.WriteLine();



// Вид 3. Что-то возвращают, но ничего не принимают.
int Method3() // В таких функциях обязательно указывается тип данных отличный от void
{
    return DateTime.Now.Year; // Обязательно используется return в конце метода.
}
int year = Method3(); // Присваиваем новую переменную для выдачи результата.
Console.WriteLine(year); //Выдаём результат через вывод.
Console.WriteLine();



// Вид 4. Методы, которые что-то принимают и что-то возвращают.
string Method4(int count, string text)
{
    int i = 0;
    string result = String.Empty; // Для начала присваиваем переменной значение пустой строки.

    while (i < count)
    {
        result = result + text;
        i++;
    }
    return result;
}
string res = Method4(10, "asdf");
Console.WriteLine(res);
Console.WriteLine();

// Цикл for.
string Method4_1(int count, string text)
{
    string result = String.Empty; // Для начала присваиваем переменной значение пустой строки.
    for (int i = 0; i < count; i++) // int i = 0; - инициализация счётчика.
                                    // i < count; - проверка условия.
                                    // i++; - увеличение счётчика.
    {
        result = result + text;
    }
    return result;
}
string res1 = Method4_1(10, " z");
Console.WriteLine(res1);
Console.WriteLine();



// Вывод таблицы умножения.
for (int i = 2; i <= 10; i++)
{
    for (int j = 2; j <= 10; j++) // Внутренний счётчик отличается от внешнего именем.
    {
        Console.WriteLine($"{i} x {j} = {i * j}"); // Запись через знак $ - интерполяция строк.
    }
    Console.WriteLine();
}