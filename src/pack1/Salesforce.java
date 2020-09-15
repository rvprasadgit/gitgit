package pack1;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Salesforce {

	WebDriver driver;
	
	@BeforeTest
	public void bot() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rvpra\\Downloads"
				+ "\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		/*
		 * driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 */
		
	}
	
	@Test
	public void fop() throws IOException
	{
		//tagname[@attribute='value'] --> Xpath Regular Expression
		//tagname[attribute='value']--> Css Regular Expression
		////tagname[contains(@attribute,'value')]
		//tagname[attribute*='value']
		driver.findElement(By.cssSelector(" [name='username']")).sendKeys("batchautomation");
		driver.findElement(By.xpath("//input[@name='username']//parent::div//input[2]")).sendKeys("Test@12345");
		
		//WebElement elem = driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.cssSelector("input.btn.btn-small")) );
		
		// driver.findElement(By.xpath("//a[(text()='ASY TDP')]//parent::td[@class='datalistrow']//"
			//	+ "preceding-sibling::td[@class='datalistrow']//input[@value='52760691']")).click();
			/*
			 * File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 * FileUtils.copyFile(src, new
			 * File("C:\\Users\\rvpra\\OneDrive\\Desktop\\Screenshot\\rediff.png"));
			 * System.out.println("TAKEN");
			 */
	
		
	

		
	}
	
	 
	  @AfterTest public void tear() { driver.quit();
	  
	  }
	 
}
