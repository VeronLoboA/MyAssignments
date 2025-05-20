package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonList {
	public static void main(String[] args) {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobilePhones");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        List<WebElement> phones = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		
		List<Integer> list=new ArrayList<Integer>();
	for (WebElement each : phones) {
		String text2 = each.getText();
		String allText = text2.replaceAll(",","" );
		int mob = Integer.parseInt(allText);
		list.add(mob);

	}
	Collections.sort(list);
	System.out.println(list);
	}
}
