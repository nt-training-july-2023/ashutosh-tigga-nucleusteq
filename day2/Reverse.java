import java.util.*;
public class Reverse{
	public int reverse(int n){
		int sum=0;
		while(n!=0){
			sum=sum*10+(n%10);
			n=n/10;
		}
		return sum;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Reverse reverse=new Reverse();
		int rev=reverse.reverse(n);
		System.out.println("reverse of "+n+" is "+rev);
	}
}