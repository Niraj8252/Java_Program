package Ty_Java_Program;

public class WithoutBubbleSortFirstMaximum {
	
	public static void main(String[] args) {
		int array[] = {20,60,70,80,40};
		int max = array[0];
		
		for(int i = 1; i<array.length;i++)
		{
			if(max<array[i])
			{
				max = array[i];
			}
		}
		System.out.println(max);
			
			
		
	}

}
