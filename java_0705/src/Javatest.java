class Shape {
    public double getArea() {}
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

public class Javatest {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(10), new Rectangle(10, 20) };
        double area = 0;

        for (Shape shape : shapes) {
            area += shape.getArea();
        }

        System.out.println(area);
    }
}