package Ty_Java_Program;

public class SwapFirstToLastAndLastToFirst {
	
	public static void main(String[] args) {
		
		int arr[] = {20,40,90,60,70,80};
		
		for(int i =0; i<2; i++)
		{
			int temp = arr[0];
		 for(int j= 1; j<arr.length;j++)
		 {
			arr[j-1] = arr[j];
		 }
		arr[arr.length-1] = temp;
		}
		
		
		for(int j =0; j<arr.length; j++)
		{
			System.out.print(arr[j]+" ");
		}
	}

}
