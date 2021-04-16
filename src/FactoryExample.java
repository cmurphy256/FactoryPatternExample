import Factory.ShapeFactory;
import interfaces.Shape;

public class FactoryExample {

    public static void main(String[] args){
        Shape circle = ShapeFactory.getShape("Circle", 2);
        System.out.println(circle.getArea());

        Shape square = ShapeFactory.getShape("Square", 5.5);
        System.out.println(square.getArea());

        Shape rectangle = ShapeFactory.getShape("Rectangle",5, 7.8);
        System.out.println(rectangle.getArea());
    }
}
