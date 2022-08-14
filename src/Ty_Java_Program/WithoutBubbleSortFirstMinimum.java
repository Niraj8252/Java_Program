package Ty_Java_Program;

public class WithoutBubbleSortFirstMinimum {
	

	public static void main(String[] args) {
		int array[] = {20,60,70,80,40};

		int min = array[0];
		for(int i = 1; i<array.length;i++)

		{
			if(min>array[i])
				{
					min = array[i];
			}
		}
		System.out.println(min);
		
	}

}
