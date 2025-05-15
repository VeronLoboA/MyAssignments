package week3marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {
	public static void main(String[] args) throws Exception {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		String results =driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/span[1]")).getText();
		System.out.println("Results:"+ results +"bags for  boys");
		driver.findElement(By.xpath("//span[text()='Safari']/parent::a")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='American Tourister']/parent::a")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Featured']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		Thread.sleep(500);
		Thread.sleep(500);
		String productName= driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]")).getText();
		System.out.println("Product Name:"+ productName);
		Thread.sleep(500);
		String description= driver.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[1]//h2")).getText();
		System.out.println("Description:"+ description);
		Thread.sleep(500);
		String discountPrize= driver.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText();
		System.out.println("Discount Prize:"+ discountPrize);
		Thread.sleep(500);
		driver.close();
		
		
		
		
		
		
		
		
	}

}
