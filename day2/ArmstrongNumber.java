package week1.day2;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int arm = 0, a,d,no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		no = sc.nextInt();
		d = no;
		while (no>0) {
			a = no%10;
			no= no/10;
			arm = arm+a*a*a;
		}
		if (arm==d) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("not a ArmStrong Number");

		}
		sc.close();
	}

}
