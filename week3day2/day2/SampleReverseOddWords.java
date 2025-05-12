package week3.day2;

public class SampleReverseOddWords {
	
	    public static void main(String[] args) {
	        String test = "I am a software tester";

	        // Split the string into words
	        String[] words = test.split(" ");

	        // Loop through each word by index
	        for (int i = 0; i < words.length; i++) {
	            if (i % 2 == 1) { // Odd index (1, 3, ...)
	                // Reverse the word
	                String reversed = "";
	                for (int j = words[i].length() - 1; j >= 0; j--) {
	                    reversed += words[i].charAt(j);
	                }
	                System.out.print(reversed + " ");
	            } else {
	                // Even index - print the word as-is
	                System.out.print(words[i] + " ");
	            }
	        }
	    }
	}



