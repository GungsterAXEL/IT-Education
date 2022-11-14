// 9. Напишите программу, которая выводит
// случайное число из отрезка [10, 99] и показывает
// наибольшую цифру числа.
// 78 -> 8
// 12-> 2
// 85 -> 8
Console.Clear();
int randomNumber = new Random().Next(10, 100); // Выдаст рандомное число в диапазоне от 10 до 99 включительно.
// int firstDigit = randomNumber / 10;
// int secondDigit = randomNumber % 10;

// if (firstDigit > secondDigit) Console.WriteLine($"Наибольшая цифра числа {randomNumber} -> {firstDigit}");
// else Console.WriteLine($"Наибольшая цифра числа {randomNumber} -> {secondDigit}");
// if (firstDigit == secondDigit) Console.WriteLine($"Цифры равны");
// else
// {
//     int max = firstDigit > secondDigit ? firstDigit : secondDigit; // Если firstDigit > secondDigit, выполняется условие?
//                                                                    // Тогда max = firstDigit, если нет: secondDigit.
//     Console.WriteLine($"Наибольшая цифра числа {randomNumber} -> {max}");
// }

int MaxDigit(int randomN)
{
    int firstDigit = randomN / 10;
    int secondDigit = randomN % 10;
    if (firstDigit == secondDigit) return -1;
    return firstDigit > secondDigit ? firstDigit : secondDigit; // После return вместо if можно сделать такую запись.
}

int maxDigit = MaxDigit(randomNumber);
string result = maxDigit > 0 ? maxDigit.ToString() : "Цифры равны"; // Переменная result задана как string, т.к. строку можно перевести в цифры.
Console.WriteLine($"Наибольшая цифра числа {randomNumber} -> {maxDigit}");

// int max1 = Math.Max(8,8);