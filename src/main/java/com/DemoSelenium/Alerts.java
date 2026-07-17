package com.DemoSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	public static void main(String[] args) throws InterruptedException, AWTException {
	    
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();	      
	      driver.manage().window().maximize();
	      driver.get("https://testautomationpractice.blogspot.com/");
	  WebElement S1 =  driver.findElement(By.xpath("//select[@id='country']"));
	      
	      Select S = new Select(S1);
	      S.selectByIndex(5);
	      
	      
//Select name = new Select (Webelement);
	      
	      
	     

	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
//	      WebElement AlertBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
//	      AlertBox.click();
//	      Alert alert = driver.switchTo().alert();
//	      alert.accept();
//	      
//	      
//	    Thread.sleep(3000);
//	      WebElement Confirmalert = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
//	      Confirmalert.click();
//	      Alert alert1 = driver.switchTo().alert();
//	      alert1.dismiss();
//	      Thread.sleep(3000);
//	      WebElement Promptalert = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]"));
//	      Promptalert.click();
//	      Alert alert2 = driver.switchTo().alert();
//	      alert2.sendKeys("QA1");
//	      alert2.accept();
	      
}
}
