package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InteractionAutomation {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("guest");
		
        ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id ='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//div[@class='crmsfa']")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdFrom']/following-sibling::a")).click();
		//String parentWindow = driver.getWindowHandle();
		//System.out.println(parentWindow );//118CDE05F6A6E71EB86BFC3FD72890DC
		//System.out.println(driver.getTitle());
		
		//click
		
		
		Set<String> childWindow = driver.getWindowHandles();
		
		//convert set into list
		
		List<String> listWindow=new ArrayList<String>(childWindow);
		
		driver.switchTo().window(listWindow.get(1));
		driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
		Thread.sleep(3000);
		driver.switchTo().window(listWindow.get(0));
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']/following-sibling::a")).click();
		Set<String> childWindow1 = driver.getWindowHandles();
		List<String> listWindow1=new ArrayList<String>(childWindow1);
		
		driver.switchTo().window(listWindow1.get(1));
		
		driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click();
		driver.switchTo().window(listWindow1.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert =driver.switchTo().alert();
		alert.accept();
		driver.switchTo().window(listWindow1.get(0));
		System.out.println(driver.getTitle());
		
		}	
	}



