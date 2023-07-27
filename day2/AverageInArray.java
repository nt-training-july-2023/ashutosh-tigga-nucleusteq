public class AverageInArray{
	public double findAverage(int []arr){
		int sum=0;
		for(int i:arr){
			sum=sum+i;
		}
		return sum/(arr.length-1);
	}
	public static void main(String args[]){
		int []arr={24,53,46,32,46,3,23};
		AverageInArray avg=new AverageInArray();
		System.out.println("Average :"+avg.findAverage(arr));
	}
}