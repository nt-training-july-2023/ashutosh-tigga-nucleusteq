import java.util.Scanner;
public class Factorial{
	public int findFact(int n){
		int fact=1;
		if(n==0){
			return 0;
		}
		else{
			for(int i=n;i>0;i--){
				fact=fact*i;
			}
		}
		return fact;
	}
	public static void main(String argss[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N number for find factorial ");
		int n=sc.nextInt();
		Factorial fact=new Factorial();
		int res=fact.findFact(n);
		System.out.println("factorial of "+n+" is "+res);
	}
}