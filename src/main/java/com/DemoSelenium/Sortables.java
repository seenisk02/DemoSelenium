package com.DemoSelenium;

import java.awt.AWTException;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortables {
	
	////tbody[@id='form:j_idt111_data']//tr
	public static void main(String[] args) throws AWTException, InterruptedException {
	 WebDriverManager.edgedriver().setup();
	  WebDriver driver = new EdgeDriver();	      
     driver.manage().window().maximize();
     driver.get("https://www.leafground.com/drag.xhtml");
     
     
     List<WebElement> ele = driver.findElements(By.xpath("//tbody[@id='form:j_idt111_data']//tr"));
     
    int size = ele.size();
    System.out.println(size);

    WebElement from = ele.get(8);
    WebElement to = ele.get(0);
    
    Actions act = new Actions(driver);
    
    act.clickAndHold(from);
    act.moveToElement(to);
    act.release(to);
    act.build().perform();
    
    
    
    
    
  //  driver.quit();
}}
