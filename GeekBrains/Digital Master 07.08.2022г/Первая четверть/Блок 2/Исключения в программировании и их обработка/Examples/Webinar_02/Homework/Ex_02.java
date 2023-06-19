package Examples.Webinar_02.Homework;

public class Ex_02 {
    /*
    Задача 2.
    Если необходимо, исправьте данный код
    (https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit).

    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }
     */
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};//, 0};
        int d = 0, index = 8;
        if (d != 0) {
            if (intArray.length > index) {
                double catchedRes1 = (double) intArray[index] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } else System.out.println("Минимально допустимая длина массива = " + (index + 1));
        } else System.out.println("Делить на ноль нельзя!");
    }
}