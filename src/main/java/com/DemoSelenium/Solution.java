package com.DemoSelenium;



import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Solution {
	public static void main(String[] args) {
		
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

	driver.get("https://www.leafground.com/drag.xhtml");
	
	
	//WebElement fita = driver.findElement(By.xpath("//div[text()='Bamboo Watch']"));
WebElement drag = driver.findElement(By.xpath("//div[@id='form:drag_content']"));
WebElement drop =driver.findElement(By.xpath("//p[@class='ui-widget-header']"));
		Actions s = new Actions(driver);
		s.dragAndDrop(drag, drop).perform();
		
		//click
		//doubleclick
		//contextclick
		//movetoelement
		//dragandrop
		//sendkeys
		
		
		
		
		
		
//		WebElement source = driver.findElement(By.id("draggable"));
//		WebElement target = driver.findElement(By.id("droppable"));
//Actio  
//		Actions actions = new Actions(driver);
//		actions.dragAndDrop(source, target).perform();
//		
		
		
	}
	
}


