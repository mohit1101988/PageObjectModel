package com.Gmail.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageWithPageFactory {
	
	WebDriver driver;
	
	@FindBy(id="login1") 
	@CacheLookup
	WebElement username;
	
	@FindBy(id="password") 
	WebElement password;
	
	@FindBy(how=How.NAME,using="proceed") 
	WebElement loginButton;
	
	public void doLogin(String user, String pass){
		
		username.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();
		
	}
	
	public LoginPageWithPageFactory(WebDriver driver){
		this.driver = driver;
	}

}
