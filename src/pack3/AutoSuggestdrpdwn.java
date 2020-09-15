package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import pack2.Driverinit;

public class AutoSuggestdrpdwn extends Driverinit {

	public static void main(String[] args) throws InterruptedException {
		
		AutoSuggestdrpdwn.driverinitialisation();
		driver.get("https://www.makemytrip.com/");

		Thread.sleep(5000);

		 driver.findElement(By.xpath("//input[@id='fromCity']")).click();

		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));

		Thread.sleep(1000);

		source.click();

		Thread.sleep(1000);

		source.sendKeys("MUM");

		Thread.sleep(1000);

		source.sendKeys(Keys.ARROW_DOWN , Keys.ENTER);
		//source.getText();
		
		

		//source.sendKeys(Keys.ENTER);

		source = driver.findElement(By.xpath("//input[@placeholder='To']"));

		Thread.sleep(1000);

		source.click();

		Thread.sleep(1000);

		source.sendKeys("DEL");

		Thread.sleep(1000);

		for(int i=1;i<3;i++)

		{

		source.sendKeys(Keys.ARROW_DOWN);

		}

		source.sendKeys(Keys.ENTER);

		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script="return document.getElementById(\"fromCity\").value;";
		
		String text=(String) js.executeScript(script);
		System.out.println("From Location :"+text);

		
		String script2="return document.getElementById(\"toCity\").value;";
		
		
		String text2=(String) js.executeScript(script2);
		System.out.println("To Location :"+text2);
		
		AutoSuggestdrpdwn.tear();
	}

}
