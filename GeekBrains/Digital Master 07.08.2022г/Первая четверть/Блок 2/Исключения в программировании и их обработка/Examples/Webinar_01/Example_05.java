package Webinar_01;

public class Example_05 {

    /*
    Реализуйте метод checkArray(Integer[] arr),
    принимающий в качестве аргумента целочисленный одномерный массив.
    Метод должен пройтись по каждому элементу и проверить что он не равен null.
    1. Если в какой-то ячейке встретился null, то необходимо "оповестить" об этом пользователя.
    2. Если null'ы встретились в нескольких ячейках, то идеально было бы все их "подсветить".
     */
    public static void checkArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) System.out.println("arr[" + i + "] = null");
        }
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{0, 1, 23, null, 12, 94, null, 639, 03, null, null};
        checkArray(arr);
    }
}
