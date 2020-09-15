package com.qa.realtimeproject.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.realtimeproject.Base.Base;

 public class Homepage extends Base{
	
	
	@FindBy(css=".signin")
	WebElement loginbtn;
	
	
	
	public Homepage() throws IOException{
		
		PageFactory.initElements(driver, this);
	}
	public String loginbtntext() {
		
		return loginbtn.getText();
		
	}
	public void loginbtnclick() {
		loginbtn.click();
		
		
	}

}
