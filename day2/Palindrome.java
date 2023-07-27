import java.util.Scanner;
import java.util.*;
public class Palindrome{
	public boolean isPlaindrome(int n){
		int actual=n;
		int sum=0;
		while(n!=0){
			sum=sum*10+(n%10);
			n=n/10;
		}
		if(actual==sum)
		{	
			return true;
		}
	return false;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Palindrome check=new Palindrome();
		boolean isPlaindrome=check.isPlaindrome(n);
		if(isPlaindrome){
			System.out.println(n+" This is Palindrome Number ");
		}else{
			System.out.println(n+" This is not Palindrome Number ");
		}
	}
}