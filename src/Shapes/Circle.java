package Shapes;

import interfaces.Shape;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius* this.radius * Math.PI;
    }
}
