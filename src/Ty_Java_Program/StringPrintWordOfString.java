package Ty_Java_Program;

import java.util.LinkedHashSet;

public class StringPrintWordOfString {
	
	public static void main(String[] args) {
		String s = "today is friday friday";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i = 0; i<str.length; i++)
		{
			set.add(str[i]);
		}
		for(String word: set)
		{
			int count = 0;
			for(int i = 0; i<str.length; i++)
			{
				if(word.equals(str[i]))
				{
					count++;
				}
			}
			System.out.println("occurance of word : "+word+" : "+count);
		}
	}

}
