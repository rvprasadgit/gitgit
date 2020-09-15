package pack2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TAbsConcept extends Driverinit {
	public static void main(String args[]) throws InterruptedException {
		TAbsConcept.driverinitialisation();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElements(By.tagName("a")).size();
		int	alllinks=driver.findElements(By.tagName("a")).size();
		System.out.println(alllinks);
		WebElement foodriver=driver.findElement(By.id("gf-BIG"));
		int foolinks=foodriver.findElements(By.tagName("a")).size();
		WebElement coldriver=foodriver.findElement(By.xpath("table/tbody/tr/td/ul"));
		int collinkscnt=coldriver.findElements(By.tagName("a")).size();
		
		for(int i=1;i<collinkscnt;i++) 
		{
			String click=Keys.chord(Keys.CONTROL,Keys.ENTER);
			foodriver.findElements(By.tagName("a")).get(i).sendKeys(click);
			Thread.sleep(5000);
			
		
		}
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext()) 
		{
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
	
		TAbsConcept.tear();
	}

}
