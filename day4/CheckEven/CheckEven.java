

public class CheckEven {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) throws NotEvenNumberException  {
        if((number>='A' && number<='Z') || (number>='a' && number<='z')){
            throw new NotEvenNumberException(" It must not contain alphabet or any another . it must be in numeric type");
        }
        this.number = number;
    }

    public boolean checkEven(){
        if(number%2==0){
            System.out.println("It's an even number");
        }else{
            throw new NotEvenNumberException(" It is not a even number ");
        }
    }
    
}
