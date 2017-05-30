package com.Gmail.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	
	By username = By.id("login1");
	By password = By.id("password");
	By loginButton = By.name("proceed");
	
	

	public void doLogin(String user, String pass){
		
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
		
	}
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
}
