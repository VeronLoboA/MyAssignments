package week3.day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 ="stops";
		String text2 ="potss";
		if(text1.length()!= text2.length()) {
			System.out.println("Lenghts mismatch, therefore the strings are not an Anagram");
		}else {
			char [] arraytext1 = text1.toCharArray();
			char [] arraytext2 = text2.toCharArray();
			
			Arrays.sort(arraytext1);
			Arrays.sort(arraytext2);
			if (Arrays.equals(arraytext1, arraytext2)) {
				System.out.println("The given strings are Anagram");
				
			} else {
				System.out.println("The given strings are not an Anagram");

			}
		}
				
				
			}
		
		
	

}
