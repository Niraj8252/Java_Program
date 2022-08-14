package Ty_Java_Program;

public class StringSumOfNumFromCombAlphaNumSpec {
	
	
	public static void main(String[] args) {

		String s = "n1i@5r$9a#j2";
		int sum =0;
		for(int i =0; i<s.length(); i++)
		{
			 if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				 int n = s.charAt(i)-48;
				 System.out.println(n);
				 sum = sum+n;
			}
		}
		
		System.out.println("sum of given number" + sum);
	}

}
