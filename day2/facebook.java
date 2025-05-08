package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class facebook {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/ ");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Rohit");
		driver.findElement(By.name("lastname")).sendKeys("Sharma");
		driver.findElement(By.name("reg_email__")).sendKeys("Sharma@gmail");
		driver.findElement(By.id("password_step_input")).sendKeys("gmail123");
		WebElement dayDD = driver.findElement(By.id("day"));
		Select select = new Select(dayDD);
		select.selectByValue("11");
		WebElement monthDD = driver.findElement(By.id("month"));
		Select select1 = new Select(monthDD);
		select1.selectByVisibleText("Nov");
		WebElement yearDD = driver.findElement(By.id("year"));
		Select select2 = new Select(yearDD);
		select2.selectByValue("2011");
		driver.findElement(By.name("Male")).click();
		
		
		
	}

}
