package Factory;

import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Square;
import interfaces.Shape;

public class ShapeFactory {

    public static Shape getShape(String type, double... params){
        Shape shape = null;

        switch(type) {
            case "Circle":
                shape = new Circle(params[0]);
                break;
            case "Square":
                shape = new Square(params[0]);
                break;
            case "Rectangle":
                shape = new Rectangle(params[0], params[1]);
        }

        return shape;
    }
}
