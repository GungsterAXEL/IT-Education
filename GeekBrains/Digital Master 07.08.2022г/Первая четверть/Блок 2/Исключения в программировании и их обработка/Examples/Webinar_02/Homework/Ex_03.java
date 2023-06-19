package Examples.Webinar_02.Homework;

public class Ex_03 {
    /*
    Задача 3.
    Дан следующий код, исправьте его там, где требуется
    (https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit).

    public static void main (String[]args) throws Exception {
            try {
                int a = 90;
                int b = 3;
                System.out.println(a / b);
                printSum(23, 234);
                int[] abc = {1, 2};
                abc[3] = 9;
            } catch (Throwable ex) {
                System.out.println("Что-то пошло не так...");
            } catch (NullPointerException ex) {
                System.out.println("Указатель не может указывать на null!");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Массив выходит за пределы своего размера!");
            }
        }
        public static void printSum (Integer a, Integer b) throws FileNotFoundException {
            System.out.println(a + b);
        }
     */
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) throws Exception {
        int a = 90, b = 3;
        // Не стал менять типы данных, вполне возможно что необходимо узнать сколько раз одно число помещается в другое без остатка.
        if (b != 0) System.out.println(a / b);
        else System.out.println("На ноль делить нельзя!");

        a = 23;
        b = 234;
        printSum(a, b);

        Integer index = 3;
        int result = 9;
        int[] abc = {1, 2};
        // Если учитывать что данные приходят извне, а переменные в примере просто для наглядности, то данная проверка имеет смысл.
        if (index != null) {
            if (abc.length > index) {
                abc[index] = result;
                System.out.println("Новое значение по индексу " + index + " = " + abc[index]);
            } else System.out.println("Минимально допустимая длина массива = " + (index + 1));
        } else System.out.println("Указатель не может указывать на null!");
    }
}
