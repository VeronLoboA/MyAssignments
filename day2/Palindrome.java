package week1.day2;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
				System.out.print("enter a number");
		int input = scanner.nextInt();
		int temp = input;
		int output = 0;
		
		for (int i = input; i >0; i=i/10) {
			int rem= i%10;
			output = (output*10)+rem;
			
		}
		if (output == temp) {
			System.out.println("its is a palindrome");
			} else {
			System.out.println("it is not a palindrome");
			
		} 
		scanner.close();		
		}		
		
	}
	


    