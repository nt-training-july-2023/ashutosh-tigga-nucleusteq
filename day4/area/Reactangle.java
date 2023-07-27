public class Reactangle extends Shape{
    private double height;
    private double width;

    @Override
    public void findArea(){
        System.out.println("Area of Reactangle is "+(width*height));
    }

}