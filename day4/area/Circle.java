import java.util.*;
public class Circle extends Shape{

    /**
     * This is program use for calculating area of circle
     *
     * @author Ashutosh Tigga
     * @version 1.1
     * @since   2023-07-22 
     * 
     */
    private double radius;
   

    /**
     * This method calculate the area od circle and Show the results
     * @param radius it takes radius as input from user and show result
     */
    @Override
    public void findArea(){
        System.out.println("Area of Circle "+((Math.PI)*(Math.pow(radius, 2))));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}