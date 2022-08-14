package Ty_Java_Program;

public class StringFindMinLenthOfString {
	public static void main(String[] args) {
String str[] = {"apple","mth","bengalore","btm","hlo","banshanka"};
		
		String min = str[0];
		for(int i =1; i<str.length;i++)
		{
			if(min.length()>str[i].length())
			{
				min = str[i];
			}
		}
//		System.out.println(min);
		
		for(int i =1; i<str.length;i++)
		{
			if(min.length()==str[i].length())
			{
				System.out.println("min lenght string is : "+str[i]);
			}
		}
	}
}
