package com.DemoSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//----------------------------------scroll up and down-------------------------------
//	js.executeScript("window.scrollBy(0,500)");
//	Thread.sleep(3000);
//	
//	js.executeScript("window.scrollBy(0,-500)");
//	
//	Thread.sleep(5000);
//	for (int i = 0; i < 10; i++) {
//		js.executeScript("window.scrollBy(0,100)");
//		Thread.sleep(1000);
		
	//----------------------------------scroll up and down for a certain element and click-------------------------------	
//		WebElement scroll = driver.findElement(By.xpath("(//div[@class='imageOverlay--eK9PK'])[1]"));
//		
//		js.executeScript("arguments[0].scrollIntoView(true)",scroll);
//		
//		
//		driver.findElement(By.xpath("//div[text()='Lakme Dew Drama Serum 6% Vitamin E & Pro-Ceramide for Skin Barrier & Dewy Radiance - 15 ml']")).click();
	//----------------------------------------input the data in the textbox--------------------------
	
	
	WebElement ik = driver.findElement(By.id("twotabsearchtextbox"));
	
	js.executeScript("arguments[0].setAttribute('value','Hello')",ik);
	
	
	WebElement element2 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	
	js.executeScript("arguments[0].click()",element2);
	
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,700)");
	Thread.sleep(3000);
	
	js.executeScript("window.scrollBy(0,-500)");
	}
		
	}


