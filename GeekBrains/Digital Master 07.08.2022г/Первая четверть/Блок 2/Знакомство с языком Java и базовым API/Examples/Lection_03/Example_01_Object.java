package Lection_03;

public class Example_01_Object {
    private static void GetType(Object o) {
        System.out.println("Тип данных переменной " + o + " : " + o.getClass().getName()); // Вывод типа данных
                                                                                           // переменной в консоль.
    }

    // Для произведения операций над типом данных Object - его сначала нужно
    // распаковать в подходящий тип данных.
    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            return (Object) ((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        } else
            return 0;
    }

    public static void main(String[] args) {
        Object o = 1;
        GetType(o); // java.lang.Integer
        o = 1.2;
        GetType(o); // java.lang.Double
        System.out.println(Sum(o, 1));
    }
}
