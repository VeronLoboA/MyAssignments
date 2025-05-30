package week5day2;

import java.io.File;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.OutputType;

import java.nio.file.Files;


public class BigBasket {
	public static void main(String[] args) throws InterruptedException,  IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
		Thread.sleep(2000);
		driver.navigate();
		WebElement mouseOver= driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(mouseOver).perform();
		Thread.sleep(2000);
		driver.navigate();
		WebElement mouseOver1= driver.findElement(By.xpath("(//a[text()='Rice & Rice Products'])"));
		builder.moveToElement(mouseOver1).perform();
		driver.findElement(By.xpath("(//a[text()='Boiled & Steam Rice'])")).click();
		Thread.sleep(2000);
		driver.navigate();
		WebElement scrollOver = driver.findElement(By.xpath("//label[text()='Bongo Bhog']"));
		builder.scrollToElement(scrollOver).perform();
		Thread.sleep(2000);
		WebElement brandSearch = driver.findElement(By.xpath("(//input[@placeholder='Search here'])[1]"));
        brandSearch.sendKeys("bb Royal");
		WebElement bbRoyal = driver.findElement(By.xpath("(//input[@class='Checkbox-sc-aryd7b-0 FilterSelection___StyledCheckbox-sc-1d3okpu-3 dOzoNh egrbst form-checkbox cursor-pointer'])[1]"));
		bbRoyal.click();
		Thread.sleep(2000);
		driver.navigate();
		WebElement vareity  = driver.findElement(By.id("i-PonniBoiledRice"));
		builder.scrollToElement(vareity).perform();
		WebElement ponniBoiledRice = driver.findElement(By.id("i-PonniBoiledRice"));
		ponniBoiledRice.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']")).click();
		
		Set<String> parentWindow =driver.getWindowHandles();
		List<String> listWindow = new ArrayList<String>(parentWindow);
		driver.switchTo().window(listWindow.get(1));
		Thread.sleep(2000);
		//WebElement price = driver.findElement(By.xpath("//td[contains(text(),'Price: ')]"));
		String price = driver.findElement(By.xpath("//td[@class='Description___StyledTd-sc-82a36a-4 fLZywG']")).getText();
		System.out.println(price);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
		Thread.sleep(2000);
		
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("bigbasket_rice_page.png");
		Files.copy(screenshot.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
		Thread.sleep(2000);
		
		driver.close();
		driver.switchTo().window(listWindow.get(0));
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
