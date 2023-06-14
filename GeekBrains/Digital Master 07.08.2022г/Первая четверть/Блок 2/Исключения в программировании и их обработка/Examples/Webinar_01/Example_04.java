package Webinar_01;

public class Example_04 {
    /*
    Задача 4.
    Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
    Необходимо посчитать и вернуть сумму элементов этого массива.
    При этом накладываем на метод 2 ограничения:
    1. Метод может работать только с квадратными массивами (количество строк = количесту столбцов).
    2. В каждой ячейке может лежать только значение 0 или 1.
    Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
     */
    // throws RuntimeException - пишется после названия метода и аргументов,
    // если есть необходимость предупредить других разработчиков, что данный метод может выбросить исключение.
    // public static int elementSum(int[][] array) throws RuntimeException {
    public static int elementSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length)
                throw new RuntimeException("Работа возможно только с квадратным массивом.");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0 || array[i][j] > 1)
                    throw new RuntimeException("Число не может быть меньше ноля или больше единицы.");
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 1, 1}};
        System.out.println(elementSum(array));

        int[][] arra = new int[][]{{1, 0, 1}, {0, 0, 2}, {1, 1, 1}};
        /*
         Блок try-cath нужен для корректной обработки конкретных исключений.
         try - пробует выполнить определённый кусок кода.
         catch - сосредоточен на отлавливании конкретного исключения.
         */
        try {
            int result = elementSum(arra);
            System.out.println("Сумма элементов квадратного массива = " + result);
        } catch (RuntimeException exception) {
            exception.printStackTrace(); // Позволяет вывести оригинальный текст исключения (обычно красный текст в консоле при наступлении исключения).
            System.out.println(exception.getMessage());
        }
    }
}
