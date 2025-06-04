package week6;

import java.io.File;
import java.io.IOException;
import java.nio.file.StandardCopyOption;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guests");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		File snap = driver.getScreenshotAs(OutputType.FILE);
		File dest =new File ("google.png");
		FileUtils.copyFile(snap, dest,StandardCopyOption.REPLACE_EXISTING);

	}

}
