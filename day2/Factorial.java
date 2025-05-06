package week1.day2;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int factorial =1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any no");
		int a = scanner.nextInt();
		
		for (int i = 1; i <= a; i++) {
			factorial = factorial*i;
			}
		System.out.println("Factorial number is:"+factorial);
		scanner.close();
	}

}
