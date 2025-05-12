package week3.day2;

public class Chrome extends Browser {
	public void openIncognito() {
		System.out.println("open Incognito ---.chrome sub class");
	}
	public void clearCache() {
		System.out.println("Clearcache ---> chrome sub class");
	}
	public static void main(String[] args) {
		Chrome c = new Chrome();
		c.openIncognito();
		c.closeBrowser();
		c.closeBrowser();
	}

}
