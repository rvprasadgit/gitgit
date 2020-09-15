package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoIt {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rvpra\\Downloads"
				+ "\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/Users/rvpra/OneDrive/Desktop/fileupload.html");
		/*
		 * WebDriverWait wait= new WebDriverWait(driver, 10);
		 * wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
		 * "#file-upload"))).click();
		 */
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='file-upload']")).sendKeys("C:\\Users\\rvpra\\OneDrive\\Desktop\\Resume\\Rv_Prasad_Software_Testing (1).pdf");
		
	}

}
