package week1.day2;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("enter no of terms");
		int number =input;
		int first =0, second =1, next;
		System.out.println("Fibonacci series is");
		for (int i = 0; i<=number;i++)
		{
			System.out.println(first +"");
			next = second+first;
			first = second;
			second = next;
		
		}
		sc.close();
		
	}

}
