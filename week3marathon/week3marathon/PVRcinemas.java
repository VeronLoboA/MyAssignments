package week3marathon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PVRcinemas {
	public static void main(String[] args) throws Exception {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("Guest");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		Thread.sleep(500);
		//chennai.click();
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		Thread.sleep(500);
		
		//("(//span([@class ='cities-names'])[2]").click();
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class ='p-dropdown-items-wrapper']//li[1]")).click();
		Thread.sleep(500);
		//driver.findElement(By.xpath("(//span[@class='p-dropdown-label p-inputtext p-placeholder'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		Thread.sleep(500);
		//driver.findElement(By.xpath("(//span[@class ='p-dropdown-label p-inputtext p-placeholder'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li[5]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class ='p-button p-component sc-hORkcV gUVSfS bgColor filter-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class ='sc-kfeOyU hsmcHs reject-terms']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='SL.SILVER|B:1']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class ='sc-dJkDXt bWYhCG btn-proceeded']")).click();
		Thread.sleep(5000);
		String seatInfo = driver.findElement(By.xpath("//div[@class ='seat-number']/p")).getText();
        System.out.println("Selected Seat(s): " + seatInfo);
        Thread.sleep(5000);
        String grandTotal = driver.findElement(By.xpath("//div[@class ='grand-tota col-md-3']//span")).getText();
        System.out.println("Grand Total: " + grandTotal);

        
}



		
		
		
		
		
	}


