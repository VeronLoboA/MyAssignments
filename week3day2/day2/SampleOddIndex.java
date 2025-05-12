package week3.day2;

public class SampleOddIndex {
	

	    public static void main(String[] args) {
	        String test = "changeme";

	        // Step 1: Convert the string to character array
	        char[] characters = test.toCharArray();

	        // Step 2: Loop through each character from end to start
	        for (int i = characters.length - 1; i >= 0; i--) {
	            // Step 3: Check if index is odd
	            if (i % 2 != 0) {
	                // Step 4: Convert to uppercase if index is odd
	                characters[i] = Character.toUpperCase(characters[i]);
	            }
	        }

	        // Step 5: Print the final output
	        System.out.print("Result: ");
	        for (char c : characters) {
	            System.out.print(c);
	        }
	    }
	


}
