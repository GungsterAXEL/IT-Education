package Webinar_02_03_04_05_06_07.Webinar_06_Example_03_ShapesAreaCalculculating.shape;

public class Square extends Shape {

    private static String TYPE = "Square";
    private static int SIDESCOUNT = 4;

    private double sideSize;


    public Square(double sideSize) {
        this.sideSize = sideSize;
    }

    public double getSideSize() {
        return sideSize;
    }

    public void setSideSize(double sideSize) {
        this.sideSize = sideSize;
    }

    public static String getTYPE() {
        return TYPE;
    }

    public static int getSIDESCOUNT() {
        return SIDESCOUNT;
    }

    @Override
    public double calculateArea(Shape shape) {
        shape.setArea(this.sideSize * this.sideSize);
        return shape.getArea();
    }

    @Override
    public String toString() {
        return String.format("%s S = %s", Square.getTYPE(), super.getArea());
    }

}
