import java.util.Scanner;
class AreaOfTriangle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input Height");
		int h=sc.nextInt();
		System.out.println("Input Base");
		int b=sc.nextInt();
		int res=(h*b)/2;
		System.out.println("Area of Triangle "+res);
	}
}