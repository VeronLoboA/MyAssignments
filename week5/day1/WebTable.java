package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://finance.yahoo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Navigate to Markets > Crypto
        driver.findElement(By.xpath("//span[text()='Markets']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Crypto']")).click();
        Thread.sleep(3000);

        // Get all table rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='yf-1570k0a bd']/tbody/tr"));
        System.out.println("Total rows: " + rows.size());

        // Loop through rows
        for (int i = 1; i <= rows.size(); i++) {
            List<WebElement> cols = driver.findElements(By.xpath("//table[@class='yf-1570k0a bd']/tbody/tr["+i+"]/td"));
            for (WebElement cell : cols) {
                System.out.print(cell.getText() + " | ");
            }
            System.out.println(); // new line after each row
        }

        driver.quit();
    }
}
