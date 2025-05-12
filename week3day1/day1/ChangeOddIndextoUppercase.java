package week3.day1;



public class ChangeOddIndextoUppercase {
	public static void main(String[] args) {
		String test ="changeme";
		char[] characters =test.toCharArray();
		for ( int i =(characters.length)-1; i>=0;i--) {
			if(i%2!=0) {
				 characters[i] = Character.toUpperCase(characters[i]);
				
				
			}
			
		}
		 System.out.print("Result: ");
		for (char c :characters) {
			System.out.print(c);
			
		}
	}

}
