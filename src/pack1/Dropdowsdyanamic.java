package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dropdowsdyanamic {

	WebDriver driver;
	@BeforeTest
	public void bot()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rvpra\\Downloads"
				+ "\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
}

  @Test (priority=2 , groups="second" ,enabled= false)
  public void TestCase001() throws InterruptedException {
  
  driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@text=\"Delhi (DEL)\"]")).click(); 
  Thread.sleep(2000); 
  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Jaipur (JAI)']")).click();
  
  }
  
  @Test(priority=3 , groups="third",enabled= false)
  public void TestCase002() throws InterruptedException {
  
	  driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	  driver.findElement(By.id("divpaxinfo")).click();
	  Thread.sleep(1500);
	  
	  Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"1 Adult" );
	  for(int i=1;i<=3;i++) 
	  {
	  
		  driver.findElement(By.id("hrefIncAdt")).click();
	  
	  }
	  driver.findElement(By.id("btnclosepaxoption")).click();
		 Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"4 Adult" ); 
  
  }
 
		
	@Test(priority=1 , groups="first" ,enabled= true)
	public void Testcase003() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		Thread.sleep(3000);
      List<WebElement> options=driver.findElements(By.xpath("//ul[@id='ui-id-1'] //a"));
		
		for(WebElement option:options) 
		{
			
			if(option.getText().equalsIgnoreCase("India")) 
			{
				option.click();
				break;
				
				
			}
		}
		
		
		}
	
	
	@Test(enabled = false)
	public void Testcase004() {
		
		
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
		boolean cb=driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected();
		System.out.println(cb);
		int cb1=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(cb1);
		
		/*
		 * int cb1=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		 * System.out.println(cb1); for(int i=1;i<=cb1;i++) {
		 * 
		 * driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		 * 
		 * 
		 * 
		 * }
		 */
		
		
	}
	
	
	//  @AfterTest public void tear() {
	  
	  //driver.quit(); }
	 

}
