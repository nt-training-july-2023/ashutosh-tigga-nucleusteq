import java.util.Scanner;

public class ArrayOfString {
    public static void main(String[] args) {
        String[] arr ={("abc"),("bcd"),("efg"),("fgh")};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Index to Access");
        try {
            
            System.out.println(arr[sc.nextInt()]);
        } catch (NullPointerException e) {
            System.out.println("array is not initialized yet it is null ");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("array size is " + arr.length + " You are exceeding its limit");
        }
    }

}
