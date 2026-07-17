package com.DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		  WebDriver driver = new EdgeDriver();	      
	    driver.manage().window().maximize();
	    driver.get("https://www.leafground.com/drag.xhtml");
	    
	   WebElement drag = driver.findElement(By.xpath("//*[@id=\"form:drag_content\"]"));
	   WebElement drop = driver.findElement(By.xpath("//*[@id=\"form:drop\"]"));
	   
	   Actions action = new Actions(driver);
	   action.clickAndHold(drag).moveToElement(drop).release().build().perform();

	}
}
