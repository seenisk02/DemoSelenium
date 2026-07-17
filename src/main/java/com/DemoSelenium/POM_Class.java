package com.DemoSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Class {

	WebDriver driver;

	public POM_Class(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//-------------------------------------------------------------------------	
	@FindBy (id = "email")
	public static WebElement user;
	
	@FindBy (id = "pass")
	public static WebElement pass;
	
	@FindBy(name ="login")       
	public static WebElement Login;
//----------------------------------------------------------------------------	
	
	public static void username() {
		user.sendKeys("seeni");
	}
	public static void password() {
		pass.sendKeys("123456789");

	}
	public static void login_btn() {
		Login.click();

	}
	
	public static void logintofacebook() {
		username();
		password();
		login_btn();
	}
	
//----------------------------------------------------------------------	
	
	

}