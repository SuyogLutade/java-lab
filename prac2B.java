import java.util.Scanner;
abstract class Shape {
    abstract void calculateArea();

    void display() {
        System.out.println("Calculating area for the shape...");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class prac2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape;
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        shape = new Circle(r);
        shape.display();
        shape.calculateArea();
        System.out.print("\nEnter length and width of rectangle: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        shape = new Rectangle(l, w);
        shape.display();
        shape.calculateArea();
        sc.close();
    }
}