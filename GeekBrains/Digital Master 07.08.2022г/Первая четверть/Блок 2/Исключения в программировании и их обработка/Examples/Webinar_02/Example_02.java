package Examples.Webinar_02;

public class Example_02 {
    /*
    Задача 2.

    Обработайте возможные исключительные ситуации.
    "Битые" значения в исходном массиве считайте нулями.
    Можно внести в код правки, которые считаете необходимыми.

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
    */
    public static int sum2d(String[][] arr) {
        int sum = 0;
        if (arr == null) {
            System.out.println("Массив не инициализирован.");
            arr = new String[0][];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) arr[i] = new String[0];
            for (int j = 0; j < arr[i].length; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
