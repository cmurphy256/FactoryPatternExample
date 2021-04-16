package Shapes;

import interfaces.Shape;

public class Square implements Shape {

    private double length;

    public Square(double length){
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
