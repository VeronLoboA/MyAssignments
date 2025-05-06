package week1.day2;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Step 1
        System.out.println("Enter the number:");
        int input = sc.nextInt();             // Step 2
        
        int number = Math.abs(input);         // Step 3
        int count = 0;                        // Step 4

        if (number == 0) {                    // Step 5
            count = 1;
        } else {
            while (number > 0) {              // Step 6
                number = number / 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count); // Step 7
        sc.close();                          // Step 8
    }
}


