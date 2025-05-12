package week3.day1;

import java.util.Arrays;

public class FindMissingElement {
	public static void main(String[] args) {
		int a [] = {1,4,3,2,8,6,7};
		
		Arrays.sort(a);
	//int a [] = {1,2,3,4,6,7,8};
		for (int i = 0; i < a.length-1; i++) { //
			if (a[i +1]!= a[i]+1) {
				System.out.println("Missing Number is"+ (a[i]+1));
			}
			
		}
				}
			
		
	}


