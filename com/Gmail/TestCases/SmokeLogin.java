package com.Gmail.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Gmail.Pages.LoginPage;
import com.Gmail.Pages.LoginPageWithPageFactory;

public class SmokeLogin {
	
	String ProjectPath = System.getProperty("user.dir");
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void setUp(){
		System.setProperty("webdriver.chrome.driver",ProjectPath+"\\src\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void TestCase1(){
		
		//Check positive login scenario
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		LoginPage login = new LoginPage(driver);		
		login.doLogin("abc", "bcdadas");
		
	}
	
	@Test
	public void TestCase2(){
		
		//Check negative login scenario
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		LoginPage login = new LoginPage(driver);		
		login.doLogin("qwe", "asdasasd");
		
	}
	
	
	@AfterSuite
	public void tearDown(){
		driver.quit();
	}

}
