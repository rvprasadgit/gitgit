package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class autosuggestivedropdowns {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rvpra\\Downloads" + "\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='products']//div[1]//div[3]//button[1]")).click();
		  driver.findElement(By.xpath("//div[@class='products-wrapper'] //div[2]//div[3]//button")).click();
		  driver.findElement(By.xpath("//div[@class='products-wrapper'] //div[3]//div[3]//button")).click();
		  driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		  driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		  
		  driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		  driver.findElement(By.cssSelector(".promoBtn")).click();
			System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());

		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		Select sl=new Select(driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select")));
		sl.selectByVisibleText("India");

		WebElement ele=driver.findElement(By.cssSelector(".chkAgree"));
		
		System.out.println(ele.isSelected());
WebElement ele3=driver.findElement(By.xpath("//button[contains(text(),'Proceed')]"));
ele3.click();

String ele2=driver.findElement(By.xpath("//b[contains(text(),'Please accept Terms & Conditions - Required')]")).getText();
     System.out.println(ele2);
     ele.click();
     ele3.click();
    System.out.println( driver.getTitle());

/*
		 * driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		 * Thread.sleep(3000); List<WebElement>
		 * options=driver.findElements(By.xpath("//ul[@id='ui-id-1'] //a"));
		 * 
		 * for(WebElement option:options) {
		 * 
		 * if(option.getText().equalsIgnoreCase("India")) { option.click(); break;
		 * 
		 * 
		 * } } System.out.println(
		 * driver.findElement(By.xpath("//input[@id='autosuggest']")).getText());
		 * System.out.println("hi");
		 */
	}
}
