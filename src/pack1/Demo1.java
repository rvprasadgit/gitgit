package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rvpra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver =new ChromeDriver();
		  driver.manage().deleteAllCookies();
	      driver .manage().window().maximize();
	      
	      try {
			driver.get("https://www.facebook.com/");
			  driver.findElement(By.xpath("//input[@id='emailo']"));
			 
		} catch (Exception e) {
			TakesScreenshot sct=(TakesScreenshot)driver;
			File src=sct.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\rvpra\\OneDrive\\Desktop\\Screenshot\\abc.png"));

			e.printStackTrace();
		}
	      
	      System.out.println("screenshot taken for failed pages");
		
		
		

	}

}
