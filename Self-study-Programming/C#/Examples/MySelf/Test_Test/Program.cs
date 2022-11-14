int[] arr = { 0, -5, 2, 3, 5, 9, -1, 7 };
Console.WriteLine($"Исходный массив: [{string.Join(", ", arr)}]");
ShakerSort(arr);
Console.WriteLine($"Отсортированный массив: [{string.Join(", ", arr)}]");



void Swap(ref int leftValue, ref int rightValue)
{
    int temp = leftValue;
    leftValue = rightValue;
    rightValue = temp;
}
void ShakerSort(int[] listS)
{
    int left = 0,
        right = listS.Length - 1,
        count = 0;

    while (left < right)
    {
        for (int i = left; i < right; i++)
        {
            count++;
            if (listS[i] > listS[i + 1])
                Swap(ref listS[i], ref listS[i + 1]);
        }
        right--;

        for (int i = right; i > left; i--)
        {
            count++;
            if (listS[i - 1] > listS[i])
                Swap(ref listS[i - 1], ref listS[i]);
        }
        left++;
    }
}