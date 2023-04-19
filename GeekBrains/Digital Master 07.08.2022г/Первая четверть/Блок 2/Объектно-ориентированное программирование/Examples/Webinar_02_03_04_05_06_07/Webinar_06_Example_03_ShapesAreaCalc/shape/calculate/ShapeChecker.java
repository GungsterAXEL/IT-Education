package Webinar_02_03_04_05_06_07.Webinar_06_Example_03_ShapesAreaCalculculating.shape.calculate;

import Webinar_02_03_04_05_06_07.Webinar_06_Example_03_ShapesAreaCalculculating.shape.Triangle;
import Webinar_02_03_04_05_06_07.Webinar_06_Example_03_ShapesAreaCalculculating.shape.Shape;

public class ShapeChecker<S extends Shape> {
    public static <S> boolean checker(S shape) {
        if (shape instanceof Triangle) {
            double a = ((Triangle) shape).getFirstSideSize();
            double b = ((Triangle) shape).getSecondSideSize();
            double c = ((Triangle) shape).getThirdSideSize();
            if (a + b <= c || b + c <= a || a + c <= b) {
                System.out.println("Такого треугольника не существует");
                return false;
            }
        }
        return true;
    }
}
