package Basic_program;

public class PrimeNo {
	
	public static void main(String[] args) {
		
		int x = 7;
		int count = 0;
		
		for(int i=1; i<=x; i++)
		{
			if(x%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(x + ": is prime number");
		}
		else {
			System.out.println(x +": is not a prime number");
		}
	}

}
