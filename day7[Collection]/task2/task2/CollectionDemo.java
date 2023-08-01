/*
Task
Create a String collection and store 20 elements in it
 Elements stored should not be repeated.
 Elements stored should preserve the insertion order
Implement different methods for this collection 
*/

import java.util.LinkedHashSet;
import java.util.*;

public class CollectionDemo {
    Set<String> listOfStringElement = new LinkedHashSet<>();
    int size = 0;

    void addElement(String element) {
        if (!listOfStringElement.contains(element)) {
            listOfStringElement.add(element);
            size++;
        }
    }

    void readElement() {
        System.out.println(listOfStringElement);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CollectionDemo obj = new CollectionDemo();
        while (true) {
            if (obj.size <= 20) {
                System.out.println("Input String Element "+obj.size);
                obj.addElement(new String(sc.nextLine()));
                obj.readElement();
            }else if(obj.size>20){
                obj.readElement();
                break;
            }
        }
        
    }///end main method
}//end class
