package com.DemoSelenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class downladfile {
	public static void main(String[] args) {
	    
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver = new EdgeDriver();	      
	      driver.manage().window().maximize();
	      driver.get("https://www.leafground.com/file.xhtml");
	      
	      WebElement Download = driver.findElement(By.xpath("//*[@id=\"j_idt93:j_idt95\"]"));
	      Download.click();
	      
	      //C:\Users\seeni\Downloads
	      //C:\Users\seeni\Downloads\TestLeaf Logo.png
	      
	      File files = new File("//C:\\Users\\seeni\\Downloads");
	      File[] List = files.listFiles();
	      System.out.println(List.length);
	      
	     for (File file : List) {
	    	 if (file.getName().equals("TestLeaf Logo.png")) {
	    		 System.out.println("File is downloaded");
	    		 break;
				
			}
			
		}
}
	
}