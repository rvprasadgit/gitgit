package pack2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar extends Driverinit  {

public static void main(String[] args) {
// TODO Auto-generated method stub

calendar.driverinitialisation();
driver.get("https://www.spicejet.com/");
//April 23

driver.findElement(By.xpath("//div[@id='flightSearchContainer'] /div[4]/button")).click();


while(!driver.findElement(By.xpath("//div[@id='ui-datepicker-div'] /div/div/div")).getText().contains("May"))
{
driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
}


List<WebElement> dates= driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first'] //td[@data-handler='selectDay']"));
//Grab common attribute//Put into list and iterate
int count=dates.size();
System.out.println(count);

for(int i=0;i<count;i++)
{
String text=dates.get(i).getText();
if(text.equalsIgnoreCase("31"))
{
dates.get(i).click();
break;
}

}
}

}