package com.qa.realtimeproject.Tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.realtimeproject.Base.Base;
import com.qa.realtimeproject.pages.Homepage;
import com.qa.realtimeproject.pages.Loginpage;

public class LoginTestTest extends Base {
	Loginpage loginpage;
	Homepage homepage;

	public LoginTestTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setup() throws IOException {

		initialisation();
		loginpage = new Loginpage();

	}

	@Test
	public void Testcasetovalidatelogo() throws InterruptedException {
		
		homepage.loginbtnclick();
	}

	@Test
	public void Enterdeatils() {
		loginpage.logindetails("rvp214", "abcd123");

	}

	

}