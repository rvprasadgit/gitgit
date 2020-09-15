package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pack2.Driverinit;

public class Table_assignment extends Driverinit{

	public static void main(String[] args) {
		Table_assignment.driverinitialisation();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table=driver.findElement(By.xpath("//table[@id='product']"));
		
		int rowscount=table.findElements(By.xpath("tbody/tr")).size();
		System.out.println(rowscount);
		
		int colcount=table.findElements(By.xpath("tbody/tr/th")).size();
		System.out.println(colcount);
		
		int trirow=table.findElements(By.xpath("tbody/tr[3]/td")).size();
		for(int i=0;i<trirow;i++) {
			
			String trirowtxt=table.findElements(By.xpath("tbody/tr[3]/td")).get(i).getText();
			System.out.println(trirowtxt);
		}
		
		Table_assignment.tear();

	}

}
