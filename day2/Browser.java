package week1.day2;

public class Browser {
	
	public  String lauchbrowser(String browserName)
    {
		System.out.println("Browser lauched successfully");
		return browserName;	
	}
	public  void loadUrl()
	{
	  System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {
		Browser BrowserClass = new Browser();
		String lauched = BrowserClass.lauchbrowser("Firefox");
		System.out.println(lauched);
		BrowserClass.loadUrl();
	}

}

