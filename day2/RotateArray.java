public class RotateArray{
	public int[] rotate(int []arr,int k,int size){
		int []arr2=new int[size];
		for(int i=0;i<=arr2.length;i++){
			System.out.println("ok"+i);
			arr2[(i+k)%(size+1)]=arr[i];
		}
		return arr2;
	}
	public static void main(String args[]){
		int []arr={12,31,123,32,12,43,54};
			for(int element:arr){
			System.out.print(element+" ");
		}
		System.out.println();
		RotateArray obj=new RotateArray();
		int[] rotatedArray=obj.rotate(arr,2,arr.length	);
		for(int element:rotatedArray){
			System.out.print(element+" ");
		}
	}
}