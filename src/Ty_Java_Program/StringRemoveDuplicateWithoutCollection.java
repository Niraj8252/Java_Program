package Ty_Java_Program;

import java.util.LinkedHashSet;

public class StringRemoveDuplicateWithoutCollection {
	

     public static void main(String[] args) {
		
		String s = "jharkhand";
		// step 01 create set of collaction and add all character
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i = 0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		for(char ch : set) {
			System.out.println(ch);
		}
     }
}
