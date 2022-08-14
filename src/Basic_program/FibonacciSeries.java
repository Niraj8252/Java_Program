package Basic_program;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int x=0;
		int y=1;
		
		System.out.print(x + " ");
		System.out.print(y + " ");
		
		for(int i=0; i<=10; i++)
		{
			int z = x+y;
			System.out.print(z + " ");
			x=y;
			y=z;
		}
	}

}
