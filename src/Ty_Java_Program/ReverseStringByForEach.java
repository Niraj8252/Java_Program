package Ty_Java_Program;

public class ReverseStringByForEach {
	
	public static void main(String[] args) {
		
	String s = "maharaja";
	char [] ch = s.toCharArray();
	
	String rev = "";
	
	for(char c : ch)
	{
	rev = c+rev;	
	}
	System.out.println(rev);
}

}
