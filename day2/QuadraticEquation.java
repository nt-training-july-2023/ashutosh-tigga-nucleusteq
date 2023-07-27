import java.util.Scanner;
import java.util.*;
public class QuadraticEquation{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("a :");
		int a=scan.nextInt();
		System.out.println("b :");
		int b=scan.nextInt();
		System.out.println("c :");
		int c=scan.nextInt();
		int d=(int)(Math.pow(b,2))-(4*a*c);
		if(d==0){
			System.out.println("One real number");
			System.out.println(((-b)+Math.sqrt(d))/(2*a));
		}
		else if(d>0){
			System.out.println("Two real number");
			System.out.println(((-b)+Math.sqrt(d))/(2*a));
			System.out.println(((-b)-Math.sqrt(d))/(2*a));
		}
		else if(d<0){
			System.out.println("Output will be imaginamry");
		}
	}
}