package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import pack2.Driverinit;

public class AutoDrpAssignment extends Driverinit {

	public static void main(String[] args) {
		AutoDrpAssignment.driverinitialisation();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement box = driver.findElement(By.id("autocomplete"));
		box.click();
		box.sendKeys("UNIT");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);

		while (!text.equalsIgnoreCase("United Kingdom (UK)")) 
		{

			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);

		}
		

		System.out.println(text);
		AutoDrpAssignment.tear();

	}

}
