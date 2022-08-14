package Basic_program;

public class Swap2No {
	
	public static void main(String[] args) {
		
		int x=10;
		int y = 20;
		
		System.out.println(x);
		System.out.println(y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+" x after swap");
		System.out.println(y+ " y after swap");
	}

}
