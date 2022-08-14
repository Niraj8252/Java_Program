package Basic_program;

public class Power {
	public static void main(String[] args) {
		
		int x=3;
		int power=2;
		int res = 1;
		
		for(int i=1; i<=power; i++) {
			res = x*res;
		}
		System.out.println(res);
	}

}
