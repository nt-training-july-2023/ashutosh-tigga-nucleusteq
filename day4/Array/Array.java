import java.util.Scanner;

public class Array {
    public static void main(String args[]) {
       int[] arr ={12,22,423,54,243,65,234};
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
