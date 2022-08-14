package Ty_Java_Program;

public class WithoutBubbleSortSecondMinimum {
	public static void main(String[] args) {
		int array[] = {20,60,10,70,5,80,40};
		int Fmin = array[0];
		int Smin = array[0];
		
		for(int i = 1; i<array.length;i++)
		{
			if(Fmin>array[i])
			{
				Smin=Fmin;
				Fmin = array[i];
			}
			else if(Smin>array[i])
			{
				Smin = array[i];
				
			}
		}
		System.out.println("First minimum element : "+Fmin+"  "+ "Second minimum element : "+Smin);
			
			
		
	}

}
