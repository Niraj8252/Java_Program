package Ty_Java_Program;

public class StringFindMaxLenthOfString {
	
	public static void main(String[] args) {
		
		String str[] = {"apple","mth","bengalore","btm","banshanka"};
		
		String max = str[0];
		for(int i =1; i<str.length;i++)
		{
			if(max.length()<str[i].length())
			{
				max = str[i];
			}
		}
		System.out.println(max);
		
		for(int i =1; i<str.length;i++)
		{
			if(max.length()==str[i].length())
			{
				System.out.println("max length string is : "+str[i]);
			}
		}
	}
		

}
