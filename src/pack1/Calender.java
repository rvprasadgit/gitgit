package pack1;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calender {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rvpra\\Downloads"
				+ "\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		System.out.println(driver.findElement(By.className("picker-second")).getAttribute("style"));
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first'] //a[text()='15']")).click();
		System.out.println(driver.findElement(By.className("picker-second")).getAttribute("style"));
	   if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
		   
		   System.out.println("disabled");
	   }else
		   Assert.assertTrue(true);
	}

}//div[@class='ui-datepicker-group ui-datepicker-group-first'] //a[text()='15']
