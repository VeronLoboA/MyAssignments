package week2.day3;

public class Methods1 {
	public static void main(String[] args) {
		Methods1 a = new Methods1();
		String b =a.output();
		System.out.println(b);
		Methods2 c = new Methods2();
		String out = c.outputData();
		System.out.println(out);
		output2();
		
		
		
	}
	public String output() {
		System.out.println("hello rohit");
		return "veron";
	}
	public static String output2() {
		System.out.println("hello rohit");
		return "veron";
	}

}
