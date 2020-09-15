package pack3;

import pack2.Driverinit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive extends Driverinit {

	public static void main(String[] args) throws InterruptedException {

		Autosuggestive.driverinitialisation();

		driver.get("https://www.ksrtc.in");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

		System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());

//Javascript DOM can extract hidden elements
//because selenium cannot identify hidden elements - (Ajax implementation)
//investigate the properties of object if it have any hidden text

//JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		
		int i = 0;
//BENGALURU INTERNATION AIPORT
		while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) 
		{
			i++;
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			System.out.println(text);

			text = (String) js.executeScript(script);
			if (i > 10)
			{
				break;
			}

		}

		if (i > 10) 
		{
			System.out.println("Element not found");
		} 
		else 
		{
			System.out.println("Element  found");
		}
	}
}
