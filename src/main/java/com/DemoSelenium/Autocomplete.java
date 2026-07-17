package com.DemoSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autocomplete {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		  WebDriver driver = new EdgeDriver();	      
	    driver.manage().window().maximize();
	    driver.get("https://www.leafground.com/select.xhtml");
	    
	  
	  
	   WebElement autocom =  driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete_input\"]"));
	   autocom.sendKeys("a");
	    
	   
	   List<WebElement> Listall = driver.findElements(By.xpath("//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li"));
	   
	 
	  System.out.println (Listall.size());
	  Thread.sleep(5000);
	   
	   for (WebElement List : Listall) {
		   if (List.getText().equals("AWS")) {
			   List.click();
			   System.out.println("Selecting"+List.getText());
			   break;
			
		}
		   
		
	}
	   
	   
	   
	}
}
