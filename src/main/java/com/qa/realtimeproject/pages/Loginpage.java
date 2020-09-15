package com.qa.realtimeproject.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.realtimeproject.Base.Base;

public class Loginpage extends Base {
	
	@FindBy(css="#login1")
	WebElement uname;
	
	@FindBy(css="#password")
	WebElement pwd;
	
	@FindBy(css=".signinbtn")
	WebElement signin;
	
	public Loginpage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public String loginpagetitle() {
		
		return driver.getTitle();
		
	}
	public void logindetails(String user , String Pass) {
		
		uname.sendKeys(user);
		pwd.sendKeys(Pass);
		signin.click();
		
	}

}
