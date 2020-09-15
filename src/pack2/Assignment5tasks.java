package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Assignment5tasks extends Driverinit {

	public static void main(String[] args) throws InterruptedException {

		Assignment5tasks.driverinitialisation();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String text=driver.findElement(By.xpath("//div[@id='checkbox-example']//label[2]")).getText();
		driver.findElement(By.xpath("//div[@id='checkbox-example']//label[2]")).click();
		     //Task-1 is done;
           
             System.out.println(text); //Task-2 is done;
       WebElement dropd=driver.findElement(By.id("dropdown-class-example"));
      
       Select sel=new Select(dropd);   
         sel.selectByVisibleText(text);//Task-3 is done
         
         driver.findElement(By.cssSelector("#name")).sendKeys(text);//Task-4 is done;
         
         driver.findElement(By.cssSelector("#alertbtn")).click();
       String ale= driver.switchTo().alert().getText();
       Thread.sleep(2000);
       
       if(ale.contains(text)) {
    	   
    	   System.out.println("Passed");
       }
       
      
       
       
       
       
        //Task-5 is done;
             

		
	}

}
