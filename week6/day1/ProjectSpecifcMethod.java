package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecifcMethod {
	public RemoteWebDriver driver;
	 @Parameters({"URL","uName","pwd"})
	@BeforeMethod
	public void preConditions(String URL,String uName,String pwd) {
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//span[text()='All Apps']")).click();
		driver.findElement(By.xpath("//p[text()='Legal Entities']")).click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		
		
		
		
	}
	
	@AfterMethod
	public void postConditions() {
		driver.close();
	}

}
