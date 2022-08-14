package Ty_Java_Program;

import java.util.LinkedHashSet;

public class StringRemoveDuplicateCharacter {
	
public static void main(String[] args) {
		
		String s = "jharkhand";
		// step 01 create set of collaction and add all character
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i = 0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		//step 02 compare each char of set with all character
		for(char ch : set)
		{
			int count =0;
			for(int i =0; i<s.length(); i++)
			{
				if(ch==s.charAt(i))
				{
					count++; // step 04 if it is matching increamenting the count
				}
			}
			//step 04  check count no and print both char and count
			if(count==1)
			{
			System.out.println("occurance of charecter : "+ch+"  "+count);
			}
		}
	}



}
