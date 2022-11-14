// Сортировка подсчётом.
// Вводный массив.
int[] array = {-10, -5, -9, 0, 2, 5, 1, 3, 1, 0, 1};
// Отсортированный массив.
int[] sortedArray = CountingSortExtended(array);

//CountingSort(array);

// Читерский вывод одномерного массива.
Console.WriteLine(string.Join(", ", sortedArray));

// Метод сортировки подсчётом.
void CountingSort(int[] inputArray)
{
    int[] counters = new int[10]; //массив повторений

    for (int i = 0; i < inputArray.Length; i++)
    {
        counters[inputArray[i]]++;
        // ourNumber = inputArray[i];
        // counters[ourNumber]++;
    }

    int index = 0;
    for (int i = 0; i < counters.Length; i++)
    {
        for (int j = 0; j < counters[i]; j++)
        {
            inputArray[index] = i;
            index++;
        }
    }
}

// Расширенный метод сортировки подсчётом.
int[] CountingSortExtended(int[] inputArray)
{
    // Нахождение максимального и минимального элементов вводного массива.
    int max = inputArray.Max();
    int min = inputArray.Min();
    // Определяем смещение для подсчёта отрицательных значений.
    int offset = -min;
    // Создаём новый массив под сортировку.
    int[] sortedArray = new int[inputArray.Length];
    // Массив совпадений.
    int[] counters = new int[max + offset + 1];


    for (int i = 0; i < inputArray.Length; i++)
    {
        counters[inputArray[i] + offset]++;
    }

    int index = 0;
    for (int i = 0; i < counters.Length; i++)
    {
        for (int j = 0; j < counters[i]; j++)
        {
            sortedArray[index] = i - offset;
            index++;
        }
    }

    return sortedArray;
}