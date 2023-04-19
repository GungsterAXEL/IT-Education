package Webinar_02_03_04_05_06_07.Webinar_06_Example_03_ShapesAreaCalculculating.shape.calculate;

import Webinar_02_03_04_05_06_07.Webinar_06_Example_03_ShapesAreaCalculculating.shape.Shape;

public interface CalculateArea<S extends Shape> {
    double calculateArea(S shape);
}
