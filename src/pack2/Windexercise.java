package pack2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class Windexercise extends Driverinit 
{

	
	public static void main(String[] args) 
	{

		Windexercise.driverinitialisation();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		
	    driver.findElement(By.xpath("//div[@class='example'] //a")).click();
	  
	    
	  
	    
	  Set<String> ids= driver.getWindowHandles();
	     Iterator<String> it=ids.iterator();
	     
	    String parentid=it.next();
	    String childid=it.next(); 
	  
	    driver.switchTo().window(childid);
	    System.out.println(driver.findElement(By.xpath("//div[@class='example'] //h3")).getText());
	  driver.switchTo().window(parentid);
	    System.out.println(driver.findElement(By.xpath("//div[@class='example'] //h3")).getText());
	  
	    Windexercise.tear();
	}
	

}
