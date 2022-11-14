// 11. Напишите программу, которая выводит случайное
// трёхзначное число и удаляет вторую цифру этого
// числа.
// 456 -> 46
// 782 -> 72
// 918 -> 98
Console.Clear();
int randomNumber = new Random().Next(100, 1000);
int SecondDM(int num) // Название метода и оператор.
{
    int firstDigit =  num / 100 * 10;
    int secondDigit = num % 10;
    return firstDigit + secondDigit;
}
int result = SecondDM(randomNumber);
Console.WriteLine($"Число {randomNumber}, результат {result}");