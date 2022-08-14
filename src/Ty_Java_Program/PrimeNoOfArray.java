package Ty_Java_Program;

public class PrimeNoOfArray {
	
	public static void main(String[] args) {
		int array[] = {3, 6, 7, 44,67};
		
		for(int i=0; i<array.length; i++)
		{
			int x = array[i];
			int count=0;
			for(int j = 1; j<=x; j++) {
				if(x%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(x+" : is prime");
			}

//			int j = 2;
//			while(x>=j)
//			{
//				if(x%j==0)
//				{
//					break;
//				}
//				else
//				{
//					j++;
//				}
//			}
//			if(x==j)
//			{
//				System.out.println(x +"  is prime");
//			}
			
		}
		
	}

}
