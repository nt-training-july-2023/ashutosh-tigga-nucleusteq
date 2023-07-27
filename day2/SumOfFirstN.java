import java.util.Scanner;
public class SumOfFirstN{
	public int find(int[] arr,int n){
		if(n<0){
			return 0;
		}
		int sum=0;
		for(int i=0;i<n;i++){
			sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String args[]){
		int []arr={12,32,43,54,64,64,65,754,735};
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println("\nEnter N number to sum");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		SumOfFirstN sum=new SumOfFirstN();
		int res=sum.find(arr,n);
		System.out.println("sum of first "+n+" is "+res);
	}
}