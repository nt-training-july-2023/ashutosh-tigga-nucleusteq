public class Reactangle   {
    private double height;
    private double width;

    
    public double getHeight() {
        return height;
    }


    public void setHeight(double height) throws InvalidDimensionException {
        if(height<=0){
            throw new InvalidDimensionException(" height must not be less than 0 or equal to zero");
        }
        this.height = height;
    }


    public double getWidth() {
        return width;
    }


    public void setWidth(double width)throws InvalidDimensionException {
        if(width<=0){
            throw new InvalidDimensionException(" height must not be less than 0 or equal to zero");
        }
        this.width = width;
    }

    public void findArea(){
        System.out.println("Area of Reactangle is "+(width*height));
    }

}