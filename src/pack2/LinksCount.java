package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pack1.Utilsss;

public class LinksCount extends Driverinit 
{

	public static void main(String[] args) 
	{


		LinksCount.driverinitialisation();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	int	alllinks=driver.findElements(By.tagName("a")).size();
		System.out.println(alllinks);
		WebElement foodriver=driver.findElement(By.id("gf-BIG"));
		int foolinks=foodriver.findElements(By.tagName("a")).size();
		System.out.println(foolinks);
		onecoltext(foodriver);
		LinksCount.tear();
		
				
		}
		
		
		
	
	public static void onecoltext(WebElement foodriver) 
	{
		
		WebElement coltwodriver=foodriver.findElement(By.xpath("table/tbody/tr/td[2]"));
		int coltwolinks=coltwodriver.findElements(By.tagName("a")).size();
		for(int i=0;i<coltwolinks;i++) 
		{
			String linktext=coltwodriver.findElements(By.tagName("a")).get(i).getText();
			if(i==0||i==4)
				System.out.println(i+"th link : "+linktext);
			else if(i==1)
				System.out.println(i+"st link : "+linktext);
			else if(i==2)
			System.out.println(i+"nd link : "+linktext);
			else if(i==3)
				System.out.println(i+"rd link : "+linktext);
			
		}
		
		
	}

}
