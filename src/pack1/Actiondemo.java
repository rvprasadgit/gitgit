package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pack2.Driverinit;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;
public class Actiondemo  {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:amazon.com");
		WebElement account=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		driver.findElement(withtagname.)
		
		//Actiondemo.srchot("amazonhome.png");
		
		
		
		
		Actiondemo.tear();
		/*
		 * WebElement
		 * account=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		 * WebElement search=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		 * Actions a=new Actions(driver);
		 * 
		 * 
		 * a.moveToElement(account).contextClick().build().perform();
		 * a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("powder").
		 * doubleClick().build().perform();
		 */
		
	}

}
