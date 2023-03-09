package Webinar_02_03_04_05_06.Example_03_ShapesAreaCalculating.shape;

import Webinar_02_03_04_05_06.Example_03_ShapesAreaCalculating.shape.calculate.CalculateArea;

public abstract class Shape implements CalculateArea {
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

}
