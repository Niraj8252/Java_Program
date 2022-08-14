package Basic_program;

public class StrongNumber {
	
	public static void main(String[] args) {
		
		int x = 145;
		int temp = x;
		int sum = 0;
		
		while(temp!=0) {
			int rem = temp%10;
			int fact = 1;
			for(int i=1; i<=rem ; i++) {
				fact = fact*i;
			}
			sum = sum + fact;
			temp = temp/10;
		}
		if(sum==x) {
			System.out.println(x + ": is strong Number");
		}
		else {
			System.out.println(x + ": is not a strong Number");
		}
	}

}
