package week2.day3;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scanner.nextLine();
		char ch;
		String nstr= "";
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			nstr= ch +nstr;
		}
		System.out.println("Reversed String is:"+nstr);
	}

}
