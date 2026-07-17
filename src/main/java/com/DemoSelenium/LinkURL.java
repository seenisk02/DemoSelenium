package com.DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkURL {
	
	public static void main(String[] args) {
	    
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver = new EdgeDriver();	      
	      driver.manage().window().maximize();
	      driver.get("https://www.leafground.com/link.xhtml");
	   // -----linked and partial linked text   
	      driver.findElement(By.linkText("Go to Dashboard")).click();
	      //driver.findElement(By.partialLinkText("Dashboard")).click();
	       
	      
	  }

}
