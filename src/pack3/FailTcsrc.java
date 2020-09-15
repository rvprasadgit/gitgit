package pack3;

import static org.testng.Assert.assertTrue;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FailTcsrc {
	public  class CaptureScreenshot {
		@Test
		public  void captureScreenMethod() throws Exception{
		                System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		        try{
		            driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		    driver.navigate().refresh();
		    //driver.findElement(By.xpath("//*[@id='cse-search-box']/div/input[4]")).sendKeys("agile"); //Statement with correct Xpath
		    driver.findElement(By.xpath("//*[@id='cse']")).sendKeys("agile"); //Statement with incorrect Xpath
		                }catch(Exception e){
		            File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(screenshotFile, new File("C:\\screenshots\\failtc001.png"));
		}
		        driver.close();
		driver.quit();
		}
		}

}
