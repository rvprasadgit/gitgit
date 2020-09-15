package com.qa.realtimeproject.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{  
	public static WebDriver driver;
	static Properties prop;
	
	public Base () throws IOException {
		 prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\rvpra\\OneDrive\\Desktop\\rv\\RealtimeProject\\src\\main\\java\\com\\qa\\realtimeprojects\\config\\data.properties");
		
		
		prop.load(fis);
		
		
	}
	
	public static void initialisation() {
		String brname=prop.getProperty("browser");
		if(brname.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
			driver.get(prop.getProperty("url"));
		}
			
	}
	
}
