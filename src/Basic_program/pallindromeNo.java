package Basic_program;

public class pallindromeNo {
	
	public static void main(String[] args) {
		
		int x = 125;
		int temp = x;
		int rev = 0;
		
		while(temp!=0) {
			int rem = temp%10;
			rev=(rev*10)+rem;
			temp = temp/10;
		}
		if(rev==x) {
			System.out.println(x +": is pallindrome no");
		}
		else {
			System.out.println(x +": is not a pallindrome no");
		}
	}

}
