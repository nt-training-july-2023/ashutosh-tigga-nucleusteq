import java.util.*;
/*Task
● Create a Integer collection and store 20 elements in it
● Display elements of in reverse order without using for loop
● Update elements of list by 5 whenever there is an element
greater than 50 is encountered.
● Display elements less than 60 */

class CollectionDemo {
    List<Integer> listOfElement = new ArrayList<>();

    public void addElement(int element) {
        System.out.println("[ added element "+element+" ]");
         listOfElement.add(element);
        if(element>50){
            System.out.println(listOfElement);
            for (int i = 0; i <listOfElement.size(); i++) {
                listOfElement.set(i, (listOfElement.get(i)+5));
            }
        }
    }

    public void readElement(){
        System.out.println("readElemet method called");
        System.out.print("[");
        for (Integer element : listOfElement) {
            if(element<60){
                System.out.print(""+element);
            }
        }
        System.out.println("]");
    }

    public void reverseElement() {
        System.out.println(" reverse method called ");
        System.out.println("reversing element ..");
         List<Integer> list = new ArrayList(listOfElement);
         System.out.println("Before Reverse list :"+list);
        Collections.reverse(list);
         System.out.println("After Reverse list :"+list);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CollectionDemo obj=new CollectionDemo();
        System.out.println(" No. Of input :");
        int noOfInput=sc.nextInt();
        for(int i=0;i<noOfInput;i++){
            System.out.println("Enter Element "+i);
            obj.addElement(sc.nextInt());
        }
        obj.reverseElement();
        obj.readElement();
    }
}