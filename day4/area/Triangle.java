

public class Triangle extends Shape{
    
    /**
     * 
     * @author Ashutosh Tigga
     * @version 1.1
     * @since   2023-07-22 
     * @param base
     * @param height
     */
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void findArea(){
        System.out.println("Area of Triangle"+((1/2)*base*height));
    }
}
