package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments(" --disable-notifications");
		//options.addArguments("block");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window Address is: "+ parentWindow);
		System.out.println("Parent Window Title is : " + driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("FLIGHTS")).click();	
		Set<String> childWindow =driver.getWindowHandles();
		List<String> listWindow= new ArrayList<String>(childWindow);
		driver.switchTo().window(listWindow.get(1));
		System.out.println("Child Window Title is"+ driver.getTitle());
		
		
		
	}

}

