package pack1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utilsss {

	 public void addItems(WebDriver driver,String[] itemsNeeded)
	  
	  {
	  
	  int j=0;
	  
	  List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
	  
	  for(int i=0;i<products.size();i++)
	  
	  {
	  
	  String[] name=products.get(i).getText().split("-");
	  
	  String formattedName=name[0].trim();
	  
	  
	  List<String> itemsNeededList = Arrays.asList(itemsNeeded);
	  
	  if(itemsNeededList.contains(formattedName))
	  
	  {
	  
	  j++;
	  
	  //click on Add to cart
	  
	  driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
	  
	  if(j==itemsNeeded.length)
	  
	  {
	  
	  break;
	  
	  }
	  
	  }
	  
	  }
	 

	}

}
