package Ty_Java_Program;

import java.util.LinkedHashSet;

public class StringPrintIndexOfCharacter {
	
	
	public static void main(String[] args) {
	
	String s = "bangalore";
	LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	 for(int i=0; i<s.length(); i++)
	  {
		set.add(s.charAt(i));
	  }
	   for(char ch : set)
	   {
		  for(int i = 0; i<s.length(); i++)
		 {
		 if(ch==s.charAt(i))
		 {
			System.out.println(ch +" "+(i+1));
			break;
		 }
	 }
   }
 }
}
