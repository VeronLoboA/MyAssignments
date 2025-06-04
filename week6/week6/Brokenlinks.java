package week6;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Brokenlinks {

	
		public static void main(String[] args) throws IOException {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("guests");
			ChromeDriver driver = new ChromeDriver(opt);
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
		     List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		     for(WebElement link : links)
		     {
		    	 SoftAssert a = new SoftAssert();
		    	 String url= link.getAttribute("href");
		    	
		    	HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		    	conn.setRequestMethod("HEAD");
		    	conn.connect();
		    	int respCode = conn.getResponseCode();
		    	System.out.println(respCode);
		    	a.assertTrue(respCode<400, "this links is broken"+link.getText()+"the code is"+respCode);
		    	a.assertAll();
		     }
			

	}

}
