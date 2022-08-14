package Ty_Java_Program;

import java.util.LinkedHashSet;

public class StringPrintIndexOfWord {
	public static void main(String[] args) {
		
		String s = "welcome to india";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		 for(int i=0; i<str.length; i++)
		  {
			set.add(str[i]);
		  }
		   for(String ch : set)
		   {
			  for(int i = 0; i<str.length; i++)
			 {
			 if(ch.equals(str[i]))
			 {
				System.out.println("index of words : "+ch +" "+(i+1));
				break;
			 }
		 }
	   }
	}
}
