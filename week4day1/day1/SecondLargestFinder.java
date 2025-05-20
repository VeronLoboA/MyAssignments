package week4.day1;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class SecondLargestFinder {
	public static void main(String[] args) {
		int[] array = {3, 2, 11, 4, 6, 7};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int num:array) {
			list.add(num);
		}
		Collections.sort(list);
	
	int secondLargestno = list.get(list.size()-2);
	System.out.println("Second Largest Number is:" + secondLargestno);
	}

}
