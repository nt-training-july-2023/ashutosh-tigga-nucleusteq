import java.util.*;
public class Armstrong{
	public boolean check(int n){
		int sum=0;
		int actual=n;
		int dig;
		while(n!=0){
			dig=n%10;
			sum=(int)Math.pow(dig,3)+sum;
			n=n/10;
		}
		if(actual==sum){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Armstrong arm=new Armstrong();
		if(arm.check(n)){
			System.out.println(n+" is Armstrong number");
		}else
			System.out.println(n+" is not Armstrong number");
	}
}