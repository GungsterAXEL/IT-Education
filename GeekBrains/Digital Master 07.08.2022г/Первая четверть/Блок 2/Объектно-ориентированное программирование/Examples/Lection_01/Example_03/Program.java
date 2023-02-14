package Lection_01.Example_03;

public class Program {

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2); // Экземпляр класса, конкретный представитель.

        System.out.println(a.getX());
        // Point2D a = new Point2D(0, 2);
        System.out.println(a.getX());
        System.out.println(a.getY());
        Point2D b = new Point2D(0); // Экземпляр класса, конкретный представитель.
        System.out.println(b);
        // Point2D b = new Point2D(0, 10);

        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
