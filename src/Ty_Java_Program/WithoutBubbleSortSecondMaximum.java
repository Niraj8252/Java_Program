package Ty_Java_Program;

public class WithoutBubbleSortSecondMaximum {
	
	public static void main(String[] args) {
		int array[] = {20,60,70,80,40};
		int Fmax = array[0];
		int Smax = array[0];
		
		for(int i = 1; i<array.length;i++)
		{
			if(Fmax<array[i])
			{
				Smax=Fmax;
				Fmax = array[i];
			}
			else if(Smax<array[i])
			{
				Smax = array[i];
				
			}
		}
		System.out.println("First maximum element : "+Fmax+"  "+ "Second maximum element : "+Smax);
			
			
		
	}

}
