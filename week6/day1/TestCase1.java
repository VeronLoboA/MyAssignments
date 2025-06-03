package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase1 extends ProjectSpecifcMethod {
	@Test
	public  void main() {
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Salesforce Automation by Veron");
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		String legalEntity = driver.findElement(By.xpath("(//slot[@name='outputField']/lightning-formatted-text)[1]")).getText();
        if (legalEntity.contains("Salesforce Automation by Veron")) {
            System.out.println("Legal Entity created successfully");
	}
	

}
}