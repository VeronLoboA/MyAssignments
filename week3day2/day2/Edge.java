package week3.day2;

public class Edge extends Browser {
	
		public void takeSnap() {
			System.out.println("snap taken ---.edge sub class");
		}
		public void clearCookies() {
			System.out.println("Clear Cookies ---> edge sub class");
		}
		public static void main(String[] args) {
			Edge b = new Edge();
			b.clearCookies();
			b.navigateBack();
			
		}

}
