package com.DemoSelenium;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.org.jline.utils.Log;

public class Tables {
	
	
	public static void main(String[] args) throws AWTException, InterruptedException {
	    
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver = new EdgeDriver();	      
	      driver.manage().window().maximize();
	      driver.get("https://www.leafground.com/table.xhtml");
	      
	      // th - table header
	      // tr - table row
	      // td - table cell
	       List<WebElement> Listofcolumn = driver.findElements(By.tagName("th"));
	       int size = Listofcolumn.size();
	       System.out.println(size);
	       
	       List<WebElement> Listofrow = driver.findElements(By.tagName("tr"));
	       int size1 = Listofcolumn.size();
	       System.out.println(size1);
	       
	       
	      WebElement Anna = driver.findElement(By.xpath("//span[text()='Anna Fali']//following::td[1]"));
	      if (Anna.isDisplayed()) {
			System.out.println("it is displayed");
		}
	      Thread.sleep(3000);
	      String text = Anna.getText();
	      
	      System.out.println(text);
	    List<Integer> number = new ArrayList<Integer>();
	      List<WebElement> elements = driver.findElements(By.xpath("(//span[text()='Anna Fali'])[1]/following::td[3]"));
	      for (WebElement webElement : elements) {
	    	  
	    	  String text2 = webElement.getText();
	    	  Log.info(text2);
	    	  number.add(Integer.parseInt(text2));
		}
	      System.out.println(number);
	      
	      int minvalue = Collections.min(number);
	      System.out.println(minvalue);
	      
	}
}
