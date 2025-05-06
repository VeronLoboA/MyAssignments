package week1.day2;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the first number");
		int a= scanner.nextInt();
		
		System.out.println("enter the Second number");
		int b= scanner.nextInt();
		a = a+b;
		b=a-b;
		a=a-b;
		System.out.println("After SWAPPING: a ="+ a +", b ="+ b);
		scanner.close();
		
	}

}
