package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortusingCollection {
	public static void main(String[] args) {
		String [] array =  {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List<String> list = new ArrayList<String>();
		
		for (String company:array) {
			list.add(company);
		}
		Collections.sort(list);
		
		System.out.println("The Companies in reverse order:");
		for (int i = list.size()-1;i>=0; i--) {
		System.out.println(list.get(i));
		
			
		
		}
		
	}
	

}
