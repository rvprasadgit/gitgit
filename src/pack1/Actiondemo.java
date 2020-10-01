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
public class Actiondemo  extends Driverinit {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:amazon.com");
		WebElement account=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		
		//Actiondemo.srchot("amazonhome.png");
		
		
		
		
		Actiondemo.tear();
		
		  WebElement
		  account3=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		  WebElement search=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		  Actions a=new Actions(driver);
		  
		  
		  a.moveToElement(account3).contextClick().build().perform();
		  a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("powder").
		  doubleClick().build().perform();
		 
		
	}

}
