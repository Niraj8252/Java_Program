package Ty_Java_Program;

public class ReverseStringWithThirdVariable {
	
	public static void main(String[] args) {
		
		String s = "Jharkhand";
		String rev = " ";
		for(int i = s.length()-1; i>=0; i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
