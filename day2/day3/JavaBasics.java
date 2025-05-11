package week2.day3;



public class JavaBasics {
	public static void main(String[] args) {
		String v ="Veron Lobo Rohit";
		String[] splittedString =v.split("Lobo");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		//System.out.println(splittedString[2]);
		System.out.println(splittedString[1].trim());
		for (int  i =v.length()-1;i >= 0; i--) {
			System.out.println(v.charAt(i));
		}
	}

}
