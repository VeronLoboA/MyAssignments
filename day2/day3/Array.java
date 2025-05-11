package week2.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
	public static void main(String[] args) {
		ArrayList<String>a = new ArrayList<String>();
		a.add("rohit");
		a.add("sharma");
		a.add("veron");
		a.add("lobo");
		//System.out.println(a.get(3));
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
			
		}
		//for(String val:a) {
			//System.out.println(val);
		//}
		System.out.println(a.contains("veron"));
		String[] name = {"rohit","sharma","veron"};
		List<String> nameArray =Arrays.asList(name);
		nameArray.contains("sharma");
		
	}

}
