public class AddMatrices{
	public int[][] add(int a[][],int b[][]){
		if(a.length==b.length && a[0].length==b[0].length){}
		int [][]sum=new int[a.length][a[0].length];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		return sum;
	}
	public static void main(String args[]){
		int [][]mat1={{1,2,3},{4,5,6},{7,8,9}};
		int [][]mat2={{1,2,3},{4,5,6},{7,8,9}};
		AddMatrices obj=new AddMatrices();
		int[][] ans=obj.add(mat1,mat2);
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(" "+ans[i][j]+" ");
			}
			System.out.println();
		}
	}
}