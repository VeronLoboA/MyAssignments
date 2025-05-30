package week5day2;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.List;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class SnapDeal {
	

	public static void main(String[] args) throws InterruptedException,  IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate();
		
		WebElement mouseOver = driver.findElement(By.xpath("//a[@class='menuLinks leftCategoriesProduct ']/span"));
		Actions builder = new Actions(driver);
		builder.moveToElement(mouseOver).perform();
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		String shoes =driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Total Sports Shoes:"+shoes);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
		Thread.sleep(2000);
		driver.navigate();
		WebElement scroll = driver.findElement(By.xpath("//div[@class='price-input']"));
		Actions act=new Actions(driver);
		act.scrollToElement(scroll).perform();
		WebElement minPrice = driver.findElement(By.name("fromVal"));
        WebElement maxPrice = driver.findElement(By.name("toVal"));
        minPrice.clear();
        minPrice.sendKeys("500");
        maxPrice.clear();
        maxPrice.sendKeys("700");
        driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
        Thread.sleep(2000);
        driver.navigate();
        WebElement scroll1 = driver.findElement(By.xpath("//a[contains(text(),'White & Blue')]"));
        act.scrollToElement(scroll1).perform();
        driver.findElement(By.xpath("//span[@class='filter-color-tile White&Blue ']")).click();
       
        List<WebElement> filters = driver.findElements(By.xpath("(//div[@class='navFiltersPill'])"));
        System.out.println("Applied Filters:");
        for (WebElement filter : filters) {
            System.out.println("- " + filter.getText());
        }
        
        Thread.sleep(2000);
        WebElement mouseOver1 = driver.findElement(By.xpath("(//p[@class='product-title'])[1]"));
        builder.moveToElement(mouseOver1).perform();
        driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
        String prize =driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
        System.out.println("The Prize:"+prize);
        String discount =driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
        System.out.println("The Discount:"+discount);
        
        Thread.sleep(2000);
        WebElement productModal = driver.findElement(By.className("product-desc-rating"));
		
        File src = productModal.getScreenshotAs(OutputType.FILE);
        File dest = new File("snapdeal_product.png");
        Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Screenshot saved successfully.");
        Thread.sleep(2000);
        driver.findElement(By.className("close")).click();

        // Close browser
        driver.quit();
      
      
		
		
		
		
	}

}
