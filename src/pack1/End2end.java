package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class End2end {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rvpra\\Downloads"
				+ "\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		 driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@text=\"Delhi (DEL)\"]")).click(); 
		  Thread.sleep(2000); 
		  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Jaipur (JAI)']")).click();
		  
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
				
				
				driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
				
				boolean cb=driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected();
				System.out.println(cb);
				int cb1=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
				System.out.println(cb1);
				
				
				System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled());
				driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).click();
				driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first'] //a[text()='15']")).click();
				System.out.println(driver.findElement(By.className("picker-second")).getAttribute("style"));
			   if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) 
			   {
				   
				   System.out.println("disabled");
			   }else
				   Assert.assertTrue(true);
			   driver.findElement(By.cssSelector("#flightSearchContainer #ctl00_mainContent_btn_FindFlights")).click();
	}

}
