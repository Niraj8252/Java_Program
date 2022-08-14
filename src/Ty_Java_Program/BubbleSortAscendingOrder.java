package Ty_Java_Program;

public class BubbleSortAscendingOrder {
	
	public static void main(String[] args) {
		int arr[] = {20,60,80,50,90,10};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
					
					// without using third variable
					arr[i] = arr[i]+arr[j];
					arr[j] = arr[i]-arr[j];
					arr[i] = arr[i]-arr[j];
				}
				
			}
		}
		
//		for(int x : arr)
//		{
//			System.out.print(x +" ");
//		}
		// throug for loop
		for(int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
