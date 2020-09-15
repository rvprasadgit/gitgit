package com.qa.realtimeproject.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.realtimeproject.Base.Base;
import com.qa.realtimeproject.pages.Homepage;
import com.qa.realtimeproject.pages.Loginpage;

public class HomeTestTest extends Base {

	Homepage homepage;
	Loginpage loginpage;

	public HomeTestTest() throws IOException {

		super();
	}

	@BeforeMethod
	public void setup() throws IOException {

		initialisation();
		homepage = new Homepage();

	}

	@Test
	public void loginbtntexttest() {

		Assert.assertEquals(homepage.loginbtntext(), "Sign in");

	}

	/*
	 * @Test public void Testcasetovalidatelogo() throws InterruptedException {
	 * 
	 * homepage.loginbtnclick(); }
	 */
	@Test
	public void Enterdeatils() {
		homepage.loginbtnclick();
		loginpage.logindetails("rvp214", "abcd123");

	}
	
	/* Assert.assertEquals(loginpage.loginpagetitle(), "Rediffmail"); */

	@AfterMethod
	public void tear() {
		driver.quit();
	}
}
