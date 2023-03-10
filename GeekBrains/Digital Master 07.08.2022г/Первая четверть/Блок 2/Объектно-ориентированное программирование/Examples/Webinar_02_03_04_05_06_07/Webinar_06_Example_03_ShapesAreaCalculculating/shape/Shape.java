package Webinar_02_03_04_05_06_07.Webinar_06_Example_03_ShapesAreaCalculculating.shape;

import Webinar_02_03_04_05_06_07.Webinar_06_Example_03_ShapesAreaCalculculating.shape.calculate.CalculateArea;

public abstract class Shape implements CalculateArea {
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

}
