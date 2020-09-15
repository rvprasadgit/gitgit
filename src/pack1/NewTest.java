package pack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
	
	@BeforeTest
	  public void beforTest() 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rvpra\\Downloads" + "\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
  @Test
  public void f() 
  {
	  driver.findElement(By.xpath("//div[@class='products']//div[1]//div[3]//button[1]")).click();
	  driver.findElement(By.xpath("//div[@class='products-wrapper'] //div[2]//div[3]//button")).click();
	  driver.findElement(By.xpath("//div[@class='products-wrapper'] //div[3]//div[3]//button")).click();
  }
  

  @AfterTest
  public void afteTest() 
  {
	 driver.quit();
  }

}
