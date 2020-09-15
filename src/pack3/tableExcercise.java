package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pack2.Driverinit;

public class tableExcercise extends Driverinit {

	static int sum;

	public static void main(String[] args) {

		tableExcercise.driverinitialisation();

		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");

		WebElement table = driver.findElement(By.xpath("//div[@id='innings_1']/div[1]"));

		int teammemscoredruns = table.findElements(By.xpath("div[@class='cb-col cb-col-100 cb-scrd-itms']//div[@class='cb-col cb-col-8 text-right text-bold']")).size();

		for (int i = 0; i < teammemscoredruns; i++) 
		{ 
			String value = table.findElements(By.xpath("div[@class='cb-col cb-col-100 cb-scrd-itms']//div[@class='cb-col cb-col-8 text-right text-bold']")).get(i).getText();

			int runtot = Integer.parseInt(value);
            sum += runtot;
			System.out.println(value);
         }

		System.out.println("sum=" + sum);
		
		 String extra = table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extras = Integer.parseInt(extra);
		sum = sum + extras;
		System.out.println("sum+extras=" + sum);

		String Totalruns = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();

		int Totalrunsvalue = Integer.parseInt(Totalruns);

		if (Totalrunsvalue == sum) {
			System.out.println("Count matches and Test case is passed");

		} else
			System.out.println("Count not matched so testcase failed");

		tableExcercise.tear();
	}

}
