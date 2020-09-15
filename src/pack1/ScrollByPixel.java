package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollByPixel {

    WebDriver driver;
    @Test
    public void ByPixel() {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\rvpra\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
        driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application		
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
        driver.manage().window().maximize();

        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("arguments[0].scrollIntoView();" ,"driver.findElement(By.xpath('r//div[3]//div[1]//div[2]//a[1]//span[2]')).click();");
    }
}
