public class LargestNo{
	public int find(int[] arr){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String args[]){
		int []arr={23,43,53,23,54,46,65,45};
		LargestNo obj=new LargestNo();
		int largest=obj.find(arr);
		System.out.println("Largest Number is "+largest);
	}
}