package com.DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	
	public static void main(String[] args) {
	    
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver = new EdgeDriver();	      
	      driver.manage().window().maximize();
	      driver.get("https://www.leafground.com/button.xhtml");
	      
	      WebElement Position = driver.findElement(By.id("j_idt88:j_idt94"));
	      
	      Point axis = Position.getLocation();
	      int X = axis.getX();
	      int Y = axis.getY();
	      
	      System.out.println(X+"and"+Y);
//------------------------------------------------
	      WebElement Colour = driver.findElement(By.id("j_idt88:j_idt96")); 
	      String  BTN =Colour.getCssValue("background");
	      System.out.println(BTN);
 //------------------------------------------------	      
	      WebElement Size = driver.findElement(By.id("j_idt88:j_idt98")); 
	      int height = Size.getSize().getHeight();
	      int Width =Size.getSize().getWidth();
	      
	      System.out.println(height+"and"+Width);
	      
//------------------------------------------------	 	
	      WebElement Enable = driver.findElement(By.id("j_idt88:j_idt92")); 
	      
	      Boolean button = Enable.isEnabled();
	      System.out.println(button);
	    //------------------------------------------------	 
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
}
}