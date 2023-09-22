package neww;

import java.util.HashSet;
import java.util.Scanner;

public class Sarada{
	
	public static void main(String[] args)  {
		String str="abcabcbb";
		int start=0;
		int end=0;
		int max=0;
		HashSet<Character> set=new HashSet<>();
		while(start<str.length()) {
			if(!set.contains(str.charAt(start))) {
				set.add(str.charAt(start));
				start++;
				max=Math.max(set.size(), max);
			}
			else {
				set.remove(str.charAt(end));
				end++;
			}
		}
		System.out.println(max);
		
	}
	

	
}
