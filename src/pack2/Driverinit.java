package pack2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driverinit {
	protected static WebDriver driver;
	public static  void driverinitialisation() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c=new ChromeOptions();
		c.merge(ch);
		
		
		 driver =new ChromeDriver(c);
		 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public static void tear() {
		
		driver.quit();
	}
	
	
	public static void srchot(String nameit) throws IOException {
		
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\screenshots"+"\\"+nameit));
		
		
		
	}

}
