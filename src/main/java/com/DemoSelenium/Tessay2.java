package com.DemoSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tessay2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();	      
	    driver.manage().window().maximize();
	    driver.get("https://www.geeksforgeeks.org/");
	    
	    List<WebElement> elements = driver.findElements(By.tagName("a"));
	    
	    for(WebElement list : elements) {
	    	System.out.println(list.getText());
	    }
	    
	}
	

	
	
	
}
