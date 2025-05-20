package week4.day1;

public class LoginPage extends BasePage {
	@Override
	public void performCommonTasks() {
		System.out.println("Common Task is Completed");
		
	}
	public static void main(String[] args) {
		LoginPage page = new LoginPage();
		page.findElement();
		page.clickElement();
		page.enterText();
		page.performCommonTasks();
		
		
	}
	

}
