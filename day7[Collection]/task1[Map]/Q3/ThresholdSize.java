import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class ThresholdSize{
    private HashMap<Integer,String> listOfMapOfData=new HashMap<Integer,String>();

    private void add(Integer key,String value,Integer size){
        if (listOfMapOfData.size()==size) {
            listOfMapOfData.clear();
             listOfMapOfData.put(key, value);
        } else {
             listOfMapOfData.put(key, value);
        }
    }

    private void read(){
        for (Map.Entry<Integer,String> entry:listOfMapOfData.entrySet()) {
            System.out.printf("Entity %d : %s",entry.getKey(),entry.getValue());
        }  
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter Size :");
        int size=sc.nextInt();
        ThresholdSize obj=new ThresholdSize();
        obj.add(sc.nextInt(),sc.nextLine(),sc.nextInt());
    }
}