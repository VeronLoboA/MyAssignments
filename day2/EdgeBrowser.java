package week1.day2;

public class EdgeBrowser {
	public static void main(String[] args) {
		Browser Browser = new Browser();
		String Edge = Browser.lauchbrowser(" Edge");
		System.out.println("The lauched browser is"+ Edge);
		Browser.loadUrl();
				
	}

}
