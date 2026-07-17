package com.DemoSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T4 {
public static void main(String[] args) {

	
	WebDriverManager.edgedriver().setup();
EdgeOptions chrome = new EdgeOptions();
	
	chrome.addArguments("--start-maximized");
	WebDriver driver = new EdgeDriver(chrome);
	
	
	driver.get("www.google.com");
	
}
}
