import java.util.Scanner;

interface Shape {
    public void area();
}

interface Reactangle {
    public double area(double length, double width);
}

interface Circle {
    public double area(double radius);
}

interface Square {
    public double area(double lengthOfSide);
}

interface Cube {
    public double area(double lengthOfSide);
}

interface Sphere {
    public double area(double radius);
}

interface Cylinder {
    public double area(double radius, double height);
}

public class Area {
    private static double length;
    private static double width;
    private static double lengthOfSide;
    private static double radius;
    private static double height;
    private final static double pi = 3.14;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = () -> {
            System.out.println("Area of Shape ");
        };
        Reactangle reactangle = (double length, double width) -> {
            return length * width;
        };
        Circle circle = (double radius) -> {
            return pi * radius * radius;
        };
        Square square = (double lengthOfSide) -> {
            return lengthOfSide * lengthOfSide;
        };
        Cube cube = (double lengthOfSide) -> {
            return 6 * lengthOfSide * lengthOfSide;
        };
        Sphere sphere = (double radius) -> {
            return 4 * pi * radius * radius;
        };
        Cylinder cylinder = (double radius, double height) -> {
            return (2 * pi * radius * height) + (2 * pi * radius * radius);
        };
        System.out.println("Enter length ");
        length = sc.nextDouble();
        System.out.println("Enter width ");
        width = sc.nextDouble();
        System.out.println("Enter height ");
        height = sc.nextDouble();
        System.out.println("Enter radius ");
        radius = sc.nextDouble();
        System.out.println("Enter lengthOfSide ");
        lengthOfSide = sc.nextDouble();
        shape.area();
        double areaOFCube = cube.area(lengthOfSide);
        double areaOfSphere = sphere.area(radius);
        double areaOfCylinder = cylinder.area(radius, height);
        double areaOfSquare = square.area(lengthOfSide);
        double areaOfCircle = circle.area(radius);
        double areaOfReactangle = reactangle.area(length, width);
        System.out.println("Area of Reactangle :" + areaOfReactangle);
        System.out.println("Area of cube :" + areaOFCube);
        System.out.println("Area of cylinder :" + areaOfCylinder);
        System.out.println("Area of circle :" + areaOfCircle);
        System.out.println("Area of sphere :" + areaOfSphere);
    }
}
