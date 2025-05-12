package week3.day2;



public class RemoveDuplicateWordsinaString {
	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		int count;
		
		String [] a = text.split(" ");
		
		for (int i = 0; i < a.length; i++) {
			count =1;
			
			if(a[i]=="") {
				continue;
				
			}
			for (int j = i+1; j < a.length; j++) {
				if (a[i].equalsIgnoreCase(a[j])) {
					count++;
					a[j]="";
				}
				
			}
		
		}
		System.out.println("The Output is:");
		for(String word:a) {
			System.out.print(word+" ");
		}
		
	}

}
