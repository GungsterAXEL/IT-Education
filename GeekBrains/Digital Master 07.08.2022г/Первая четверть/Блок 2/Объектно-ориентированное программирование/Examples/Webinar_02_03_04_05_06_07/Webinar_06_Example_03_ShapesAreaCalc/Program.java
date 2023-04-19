package Webinar_02_03_04_05_06_07.Webinar_06_Example_03_ShapesAreaCalculculating;

import Webinar_02_03_04_05_06_07.Webinar_06_Example_03_ShapesAreaCalculculating.shape.Rectangle;
import Webinar_02_03_04_05_06_07.Webinar_06_Example_03_ShapesAreaCalculculating.shape.Triangle;
import Webinar_02_03_04_05_06_07.Webinar_06_Example_03_ShapesAreaCalculculating.shape.Shape;
import Webinar_02_03_04_05_06_07.Webinar_06_Example_03_ShapesAreaCalculculating.shape.Square;
import Webinar_02_03_04_05_06_07.Webinar_06_Example_03_ShapesAreaCalculculating.shape.calculate.ShapeChecker;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(6));
        shapes.add(new Triangle(4, 4, 6));
        shapes.add(new Square(3));
        shapes.add(new Rectangle(8, 20));
        shapes.add(new Triangle(2, 2, 9));
        shapes.add(new Rectangle(6, 4));

        for (Shape shape : shapes) {
            if (ShapeChecker.checker(shape)) {
                shape.calculateArea(shape);
                System.out.println(shape.toString());
            }
        }
    }
}
