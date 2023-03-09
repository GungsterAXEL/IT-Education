package Webinar_02_03_04_05_06.Example_03_ShapesAreaCalculating.shape.calculate;

import Webinar_02_03_04_05_06.Example_03_ShapesAreaCalculating.shape.Shape;

public interface CalculateArea<S extends Shape> {
    double calculateArea(S shape);
}
