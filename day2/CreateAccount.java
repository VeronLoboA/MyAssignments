package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
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
				driver.findElement(By.linkText("Create Account")).click();
				driver.findElement(By.id("accountName")).sendKeys("Rohit");
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
				WebElement industryDD =driver.findElement(By.name("industryEnumId"));
				Select select =new Select(industryDD);
				select.selectByIndex(3);
				WebElement ownershipsDD = driver.findElement(By.name("ownershipEnumId"));
				Select select1 =new Select(ownershipsDD);
				select1.selectByVisibleText("S-Corporation");
				WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
				Select select2 = new Select(sourceDD);
				select2.selectByValue("LEAD_EMPLOYEE");
				WebElement campaignDD = driver.findElement(By.id("marketingCampaignId"));
				Select select3 = new Select(campaignDD);
				select3.selectByIndex(6);
				WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
				Select select4 = new Select(stateDD);
				select4.selectByValue("TX");
				driver.findElement(By.className("smallSubmit")).click();
				String title = driver.getTitle();
				System.out.println(title);
				driver.close();
		
	}

}
