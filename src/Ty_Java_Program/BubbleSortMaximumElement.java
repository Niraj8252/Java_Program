package Ty_Java_Program;

public class BubbleSortMaximumElement {
	public static void main(String[] args) {
		int arr[] = {70,20,50,70,90,80,30,40};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
			System.out.println("First Maximum element of the array"+arr[0]);
			System.out.println("2nd Maximum element of the array"+arr[1]);
			System.out.print("Minimum element of the array"+arr[arr.length-1]);
	}

}
