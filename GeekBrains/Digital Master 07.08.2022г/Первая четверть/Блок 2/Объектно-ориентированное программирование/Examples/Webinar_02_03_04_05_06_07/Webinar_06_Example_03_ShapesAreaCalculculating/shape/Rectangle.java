package Webinar_02_03_04_05_06_07.Webinar_06_Example_03_ShapesAreaCalculculating.shape;

public class Rectangle extends Square {
    private static String TYPE = "Rectangle";
    private static int SIDESCOUNT = 4;
    private double secondSideSize;

    public Rectangle(double sideSize, double secondSideSize) {
        super(sideSize);
        this.secondSideSize = secondSideSize;
    }

    public static String getTYPE() {
        return TYPE;
    }

    public static int getSIDESCOUNT() {
        return SIDESCOUNT;
    }

    public double getSecondSideSize() {
        return secondSideSize;
    }

    public void setSecondSideSize(double secondSideSize) {
        this.secondSideSize = secondSideSize;
    }

    @Override
    public double calculateArea(Shape shape) {
        shape.setArea(getSideSize() * this.secondSideSize);
        return shape.getArea();
    }

    @Override
    public String toString() {
        return String.format("%s S = %s", Rectangle.getTYPE(), super.getArea());
    }

}
