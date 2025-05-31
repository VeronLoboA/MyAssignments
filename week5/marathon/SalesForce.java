package week5.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class SalesForce {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Shadow shadow=new Shadow(driver);
		WebElement product =shadow.findElementByXPath("//span[text()='Products']");
		product.click();
		Thread.sleep(2000);
		
		
		WebElement scrollOver =shadow.findElementByXPath("//a[text()='See all product pricing']");
		Actions act = new Actions(driver);
		act.scrollToElement(scrollOver).perform();
		
		shadow.findElementByXPath("//a[text()='See all product pricing']").click();
		//WebElement scrollOver1 =driver.findElement(By.xpath("//a[text()='Agentforce']"));
		
		//act.scrollToElement(scrollOver1).perform();
		driver.findElement(By.linkText("Agentforce")).click();
		System.out.println(driver.getTitle());  
		driver.close();
		
				
	}

}
