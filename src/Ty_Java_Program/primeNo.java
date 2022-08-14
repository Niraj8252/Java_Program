package Ty_Java_Program;

public class primeNo {
	public static void main(String[] args) {
		
		int x = 10;
		int i= 2;
		while(x>=0)
		{
			if(x%i==0)
			{
				break;
			}
			else
			{
				i++;
			}
			
		}
		
		if(x==i)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	
	}

}
