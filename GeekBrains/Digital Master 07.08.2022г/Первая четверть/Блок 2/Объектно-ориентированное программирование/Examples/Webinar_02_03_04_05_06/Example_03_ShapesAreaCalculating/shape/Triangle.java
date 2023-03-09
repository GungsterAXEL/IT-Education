package Webinar_02_03_04_05_06.Example_03_ShapesAreaCalculating.shape;

import Webinar_02_03_04_05_06.Example_03_ShapesAreaCalculating.shape.calculate.ShapeChecker;

public class Triangle extends Shape {
    private static String TYPE = "Triangle";
    private static int SIDESCOUNT = 3;

    private double firstSideSize;
    private double secondSideSize;
    private double thirdSideSize;

    public Triangle(double firstSideSize, double secondSideSize, double thirdSideSize) {
        this.firstSideSize = firstSideSize;
        this.secondSideSize = secondSideSize;
        this.thirdSideSize = thirdSideSize;
    }

    public static String getTYPE() {
        return TYPE;
    }

    public static int getSIDESCOUNT() {
        return SIDESCOUNT;
    }

    public double getFirstSideSize() {
        return firstSideSize;
    }

    public void setFirstSideSize(double firstSideSize) {
        this.firstSideSize = firstSideSize;
    }

    public double getSecondSideSize() {
        return secondSideSize;
    }

    public void setSecondSideSize(double secondSideSize) {
        this.secondSideSize = secondSideSize;
    }

    public double getThirdSideSize() {
        return thirdSideSize;
    }

    public void setThirdSideSize(double thirdSideSize) {
        this.thirdSideSize = thirdSideSize;
    }


    @Override
    public double calculateArea(Shape shape) {
        if (ShapeChecker.checker(shape)) {
            double p = (this.firstSideSize + this.secondSideSize + this.thirdSideSize) / 2;
            shape.setArea((p * (p - this.firstSideSize) * (p - this.secondSideSize) * (p - this.thirdSideSize)) * 0.5);
        }
        return shape.getArea();
    }

    @Override
    public String toString() {
        return String.format("%s S = %s", Triangle.getTYPE(), super.getArea());
    }

}
