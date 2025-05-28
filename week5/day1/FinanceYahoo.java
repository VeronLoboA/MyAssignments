package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinanceYahoo {
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://finance.yahoo.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//span[text()='Markets']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Crypto']")).click();
			//WebElement table = driver.findElement(By.xpath("//table[@class='yf-1570k0a bd']"));
			List<WebElement> rowCount = driver.findElements(By.xpath("//table[@class='yf-1570k0a bd']/tbody/tr"));
			int size = rowCount.size();
			System.out.println(size);
			//List<WebElement> colCount = driver.findElements(By.xpath("//table[@class='yf-1570k0a bd']/thead/tr/th"));
			List<WebElement> colCount = driver.findElements(By.xpath("//table[@class='yf-1570k0a bd']/tbody/tr/td"));
			int size1 = colCount.size();
			System.out.println(size1);
			List<WebElement> singleRow = driver.findElements(By.xpath("//table[@class='yf-1570k0a bd']/tbody/tr"));
			 for(WebElement rowIter :singleRow){
				System.out.println(rowIter.getText()); 
			 List<WebElement> allData = driver.findElements(By.xpath("//table[@class='yf-1570k0a bd']/tbody/tr/td"));
			 for(WebElement data : allData) {
				 System.out.println(data);
			
			for (int i = 1; i < rowCount.size(); i++) {
				 driver.findElement(By.xpath("//table[@class='yf-1570k0a bd']/tbody/tr["+i+"]/td"));
				 
				 System.out.println("----------------------");
				 
				 for (int j = 1; j < colCount.size(); j++) {
					 WebElement datas = driver.findElement(By.xpath("//table[@class='yf-1570k0a bd']/tbody/tr["+i+"]/td["+j+"]"));
					System.out.println(datas.getText());
				}
			
			
			 
	}
			
		}

		}
			 
		}
}
