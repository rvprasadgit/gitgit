package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import pack2.Driverinit;

public class Autodrpdwnusingwhile extends Driverinit {

	public static void main(String[] args) throws InterruptedException {
		Autodrpdwnusingwhile.driverinitialisation();
		driver.get("https://ksrtc.in/");
		Thread.sleep(6000);
		WebElement frm = driver.findElement(By.id("fromPlaceName"));
		frm.click();
		frm.sendKeys("beng");
		driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.DOWN);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);

		// System.out.println(text);//1st text
		int i = 0;
		while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
			i++;
			driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.DOWN);
			
			text = (String) js.executeScript(script);
			
		}
		frm.sendKeys(Keys.ENTER);
		System.out.println(text);

		if (i > 10) {
			System.out.println("Element not found");
		} else {
			
			System.out.println("Element  found :"+text);
		}

		Autodrpdwnusingwhile.tear();

	}

}
