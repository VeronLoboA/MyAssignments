package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementinList {
	public static void main(String[] args) {
		int [] array =  {1, 2, 3, 4, 10, 6, 8};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int num : array) {
			list.add(num);
		}
		Collections.sort(list);
		
		List<Integer> missinIntegers = new ArrayList<Integer>();
		for (int i = 0; i < list.size()-1; i++) {
			int current = list.get(i);
			int next = list.get
					(i+1);
			for (int j = current+1; j <next ; j++) {
				missinIntegers.add(j);
			}
				
		}
		if (missinIntegers.isEmpty()) {
			System.out.println("There is no Missing Numbers");
		} else {
			System.out.println("The Missing Numbers are:"+ missinIntegers);

		}
		
	}

}
