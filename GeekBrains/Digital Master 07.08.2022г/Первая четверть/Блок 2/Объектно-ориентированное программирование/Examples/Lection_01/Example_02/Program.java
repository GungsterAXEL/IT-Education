package Lection_01.Example_02;

public class Program {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        Point2D a = new Point2D(); // Экземпляр класса, конкретный представитель.
        a.x = 0; // Конкретное значение нужного поля.
        a.y = 2; // Конкретное значение нужного поля.
        System.out.println(a.toString());

        Point2D b = new Point2D(); // Экземпляр класса, конкретный представитель.
        b.x = 0; // Конкретное значение нужного поля.
        b.y = 10; // Конкретное значение нужного поля.
        System.out.println(b.toString());
        System.out.println(distance(a, b));

    }
}
