// Задача 30: Напишите программу, которая
// выводит массив из 8 элементов, заполненный
// нулями и единицами в случайном порядке.
// [1,0,1,1,0,1,0,0]

Console.Clear();

int[] arr = new int[8];
void RandomM(int[] arr1)
{
    Random randArr = new Random();
    for (int i = 0; i < arr.Length; i++)
    {
        arr1[i] = randArr.Next(0, 2);
    }
}
void PrintRandomM(int[] arr1)
{
    Console.Write("[");
    for (int i = 0; i < arr1.Length; i++)
    {
        if (i < arr1.Length-1) Console.Write($" {arr1[i]}, ");
        else Console.Write($" {arr1[i]} ");
    }
    Console.Write("]");
}
RandomM(arr);
PrintRandomM(arr);