package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase2 extends ProjectSpecifcMethod {
	@Test
	public void main() {
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		
		driver.findElement(By.xpath("//label[text()='Status']")).click();
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		String alertMsg = driver.findElement(By.xpath("//div[@class='genericNotification']/strong")).getText();
        if (alertMsg.contains("Review the following fields")) {
            System.out.println("Error message verified: " + alertMsg);
        }
	}

}
