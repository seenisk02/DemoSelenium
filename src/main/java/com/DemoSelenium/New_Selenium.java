package com.DemoSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New_Selenium {

	public static void main(String[] args) throws AWTException, IOException  {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
	   driver.navigate().to("https://www.leafground.com/input.xhtml");
		driver.navigate().back();
	    String dec1 = "C:\\Users\\seeni\\eclipse-workspace\\Seeni_Sk\\DemoSelenium\\fita\\seeni.png";
	   TakesScreenshot S = (TakesScreenshot) driver;
	   File src = S.getScreenshotAs(OutputType.FILE);
	   File dec = new File(dec1);
	   FileUtils.copyFile(src, dec);
	   
	    
}}

