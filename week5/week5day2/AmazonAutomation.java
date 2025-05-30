package week5day2;

import java.nio.file.Files;
import java.io.File;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;


public class AmazonAutomation {
	private static WebElement scroll;

	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		String prize = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("The Prize Of the Product:"+prize);
		String rating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("The Number of persons rated:"+rating);
		driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
		Set<String> parentWindow = driver.getWindowHandles();
		List<String> listWindow = new ArrayList<String>(parentWindow);
		driver.switchTo().window(listWindow.get(1));
		
		WebElement productModal = driver.findElement(By.xpath("//div[@id='imgTagWrapperId']"));
		
        File src = productModal.getScreenshotAs(OutputType.FILE);
        File dest = new File("amazon_product.png");
        Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Screenshot saved successfully.");
        Thread.sleep(2000);
        
        driver.navigate();
        WebElement scroll = driver.findElement(By.xpath("//span[text()='Add gift options']"));
        Actions act=new Actions(driver);
		act.scrollToElement(scroll).perform();
		 
		WebElement cli = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		act.click(cli).perform();
        
        String subTotal =driver.findElement(By.xpath("//span[@class='ewc-subtotal-amount']/h2")).getText();
        System.out.println("The SubTotal of the Cart:"+subTotal);
        
        if(subTotal.contains(prize)) {
        	System.out.println("Subtotal matches the product price");
        }else {
        	System.out.println("Subtotal does not match product price");
        }
        Thread.sleep(2000);
        driver.quit();
        
      
      
		
		
	}}
