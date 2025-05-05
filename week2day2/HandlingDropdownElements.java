package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownElements {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("saranya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(sourceDD);
		select.selectByIndex(4);
		WebElement campaignDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select select1 = new Select(campaignDD);
		select1.selectByVisibleText("Automobile");
		WebElement ownershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select select2 = new Select(ownershipDD);
		select2.selectByValue("OWN_CCORP");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		
		
		
		
		
		
	}
}
