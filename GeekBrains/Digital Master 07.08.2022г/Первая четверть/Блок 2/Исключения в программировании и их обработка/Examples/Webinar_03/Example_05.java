package Examples.Webinar_03;

import Examples.Webinar_03.Exceptions.MyArrayDataException;
import Examples.Webinar_03.Exceptions.MyArraySizeException;

public class Example_05 {
    /*
    Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
    При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
    Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
    должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    В методе main() вызвать полученный метод, обработать возможные исключения
    MyArraySizeException и MyArrayDataException и вывести результат расчета
    (сумму элементов, при условии что подали на вход корректный массив).
    */
    public static void main(String[] args) {
        String[][] strings = new String[4][];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = new String[4];
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j] = String.valueOf(j);
            }
        }

        strings[0][2] = "jsrkflsjd";
        strings[1][3] = "aassas";
        try {
            System.out.println(sum(strings));
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println(e.getIndexes());
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    public static int sum(String[][] arr) throws MyArrayDataException, MyArraySizeException{
        checkSize(arr);
        checkData(arr);
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int num = Integer.parseInt(arr[i][j]);
                sum += num;
            }
        }
        return sum;
    }

    private static void checkSize(String[][] arr) throws MyArraySizeException {
        boolean correct = true;
        if (arr.length != 4){
            correct = false;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4){
                    correct = false;
                    break;
                }
            }
        }
        if (!correct){
            throw new MyArraySizeException();
        }
    }

    private static void checkData(String[][] arr) throws MyArrayDataException {
        MyArrayDataException exception = new MyArrayDataException();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (!arr[i][j].matches("[0-9]+")){
                    exception.addIndexes(i, j);
                }
            }
        }
        if (exception.work()){
            throw exception;
        }
    }
}
