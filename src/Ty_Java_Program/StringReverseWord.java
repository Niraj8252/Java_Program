package Ty_Java_Program;

public class StringReverseWord {
	
	public static void main(String[] args)
	{
	  String s= "i am niraj";
	  String []str =s.split(" ");
		for(int i= str.length-1; i>=0; i--)
		{
			System.out.print(str[i]+" ");
		}	
	}
}
