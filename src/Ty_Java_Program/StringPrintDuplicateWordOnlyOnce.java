package Ty_Java_Program;

import java.util.LinkedHashSet;

public class StringPrintDuplicateWordOnlyOnce {
	
	public static void main(String[] args) {
		String s = "today is is friday friday";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i = 0; i<str.length; i++)
		{
			set.add(str[i]);
		}
		for(String word : set)
		{
			System.out.println(word+" ");
		}
		
	}
}
