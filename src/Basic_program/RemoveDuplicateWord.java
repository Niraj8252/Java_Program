package Basic_program;

import java.util.LinkedHashSet;

public class RemoveDuplicateWord {
	public static void main(String[] args) {
		
		String s = "hello good morning good niraj good to see hello you";
		String str []= s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i=0; i<str.length; i++)
		{
			set.add(str[i]);
		}
		System.out.println(set);
		for(String s1 : set)
			
		{
			int count=0;
			for(int i=0; i<str.length; i++) {
				if(s1.equals(str[i])) {
				count++;
			}
			}
			if(count>0) {
				System.out.println(s1+" => "+count);
			}
		}
	}
}

