package com.Gmail.TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.Gmail.Pages.LoginPageWithPageFactory;

import Utils.BrowserFactory;

public class SmokeLoginWithPageFactory {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		WebDriver driver = BrowserFactory.StartBrowser("chrome");
		SmokeLoginWithPageFactory.driver = driver;
	}
	
	@Test
	public void TestCase1(){
		
		//Check positive login scenario		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		LoginPageWithPageFactory login = PageFactory.initElements(driver, LoginPageWithPageFactory.class);
		login.doLogin("abc", "bcdadas");
	}
	
	@Test
	public void TestCase2(){
		
		//Check negative login scenario
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		LoginPageWithPageFactory login = PageFactory.initElements(driver, LoginPageWithPageFactory.class);
		login.doLogin("qwe", "aqweqwe");
	}
	
	@AfterSuite
	public void tearDown(){
		driver.quit();
	}


}
