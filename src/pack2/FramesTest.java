package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FramesTest extends Driverinit 
{

	public static void main(String[] args) 
	{

		FramesTest.driverinitialisation();

		FramesTest.driverinitialisation();
		driver.get("https://jqueryui.com/droppable/");
		int num = driver.findElements(By.tagName("iframe")).size();
		for (int i = 0; i < num; i++) 
		 {
			driver.switchTo().frame(i);
			Actions a = new Actions(driver);
			driver.findElement(By.xpath("//div[@id='draggable']")).click();
			WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
			WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
			a.dragAndDrop(source, target).build().perform();
			driver.switchTo().defaultContent();
		}

	}
}
