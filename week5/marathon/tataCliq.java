package week5.marathon;

import java.io.File;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v129.page.model.Screenshot;
import org.openqa.selenium.interactions.Actions;


import com.google.common.io.Files;

public class tataCliq {
	
	public static void main(String[] args) throws InterruptedException,IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate();
		WebElement brands = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brands).perform();
		
		Thread.sleep(2000);
		driver.navigate();
		WebElement watch = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		builder.moveToElement(watch).perform();
		
		Thread.sleep(2000);
		driver.navigate();
		WebElement watch1 = driver.findElement(By.xpath("//div[text()='Casio']"));
		builder.moveToElement(watch1).perform();
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		
		Thread.sleep(2000);
		 WebElement sortBy = driver.findElement(By.className("SortDesktop__base"));
		 sortBy.click();
		 
		 //WebElement arrival =driver.findElement(By.xpath("//div[text()='New Arrivals']"));
		 WebElement newArrivals = driver.findElement(By.xpath("//option[text()='New Arrivals']"));
	        newArrivals.click();
	        Thread.sleep(2000);
		 //arrival.click();
	        driver.findElement(By.xpath("(//div[text()='Men'])[1]")).click(); 
	        Thread.sleep(2000);
	        List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
			System.out.println(priceList.size());
			
			for (WebElement iter : priceList) {
				System.out.println(iter.getText());
			}
	        
	       // List<WebElement> prices = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
	       // System.out.println("The prices are:");
	       // for(WebElement allPrices:prices) {
	         //  System.out.println(allPrices.getText());
	       // }
	        
	        
	       driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();
	         
	         Thread.sleep(2000);
	        Set<String> parentWindow = driver.getWindowHandles();
	        List<String> window = new ArrayList<String>(parentWindow);
	        driver.switchTo().window(window.get(1));
	        Thread.sleep(2000);
	        
	        driver.navigate();
	        WebElement scrollOver = driver.findElement(By.xpath("//span[text()='Delivery by']"));
	        Actions act = new Actions(driver);
	        act.scrollToElement(scrollOver).perform();
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.className("DesktopHeader__myBagShow")).click();
	         WebElement bagPrice = driver.findElement(By.xpath("//div[@class='DesktopCheckout__info DesktopCheckout__label']"));
	         System.out.println("The Bag Price:"+ bagPrice.getText());
	        WebElement totalPrice = driver.findElement(By.xpath("//div[@class='DesktopCheckout__price']"));
	        System.out.println("The Total Price:"+ totalPrice.getText());
	        
	        String Input1 = bagPrice.getText().replace("₹", "");
	        String Input2 = totalPrice.getText().replace("₹ ", "");
	        
	        int dot = Input1.indexOf('.');
	        if (dot != -1) {
	            Input1 = Input1.substring(0, dot);
	        }
	        int dot2 = Input2.indexOf('.');
	        if (dot2 != -1) {
	            Input2 = Input2.substring(0, dot2);
	        }
	        // Step 3: Convert to integer
	        int price1 = Integer.parseInt(Input1);
	        int price2 = Integer.parseInt(Input2);

	        
	        if(price1 == (price2)) {
	        	System.out.println("Prices are same");
	        }else {
	        	System.out.println("Prices are not same");
	        }
	        
	        
	        
	        
				 
	}

}
