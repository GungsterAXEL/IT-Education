/**
 * Дан массив двоичных чисел, например [1,1,0,1,1,1,1],
 * вывести максимальное количество подряд идущих 1.
 * Найти максимальное количество подряд идущих одинаковых элементов массива.
 * (постараться сделать с одним циклом)
 */
public class Example_02_MaxCount {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1, 1 };
        int x = 1, count = 0, maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
                if (maxCount < count)
                    maxCount = count;
            } else 
                count = 0;
        }
        System.out.println(maxCount);
    }
}