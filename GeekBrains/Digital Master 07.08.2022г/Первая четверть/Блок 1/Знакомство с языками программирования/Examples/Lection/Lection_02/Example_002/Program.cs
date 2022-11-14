// Нахождение максимального из девяти чисел.
Console.Clear();
int Max(int arg1, int arg2, int arg3)
{
    int result = arg1;
    if (arg2 > result) result = arg2;
    if (arg3 > result) result = arg3;
    return result;
}
// Массивы начинают нумероваться с нулевого индекса.
//               0    1    2    3    4    5    6    7    8
int[] array = { 112, 224, 623, 464, 585, 647, 747, 848, 349 };

int max = Max(
    Max(array[0], array[1], array[2]),
    Max(array[3], array[4], array[5]),
    Max(array[6], array[7], array[8])
);
Console.WriteLine(max);