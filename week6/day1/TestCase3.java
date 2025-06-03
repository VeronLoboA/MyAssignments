package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase3 {
	public RemoteWebDriver driver;
	 @Parameters({"URL","uName","pwd"})
	@BeforeMethod
	public void preConditions(String URL,String uName,String pwd) {
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//span[text()='All Apps']")).click();
		driver.findElement(By.xpath("//p[text()='Legal Entities']")).click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
	 }
		
		
	
	    
        
		
		
		
	
	
	@AfterMethod
	public void postConditions() {
		driver.close();
	}

	@Test(dataProvider="fetchData")
	public void conditions(String entity) {
	driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(entity);
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	
	String legalEntity = driver.findElement(By.xpath("(//slot[@name='outputField']/lightning-formatted-text)[1]")).getText();
    if (legalEntity.contains("Salesforce Automation by Veron")) {
        System.out.println("Legal Entity created successfully");
}else {
	System.out.println("Legal Entity not created successfully");
}
    
	}
    @DataProvider(name="fetchData")
    public String[][] data() {
		String[][] name=new String[2][1];
		name[0][0]="Salesforce Automation by veron";
		name[1][0]="Salesforce Automation by lobo";
		return name;

}
}
	
	
