package com.DemoSelenium;

import java.awt.AWTException;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlink {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
	    
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver = new EdgeDriver();	      
	      driver.manage().window().maximize();
	      driver.get("https://www.leafground.com/link.xhtml");
	      
	      
	      WebElement Homepage = driver.findElement(By.linkText("Go to Dashboard"));
	      Homepage.click();
	      
	      Thread.sleep(3000);
	      
	      driver.navigate().back();
	      WebElement Wheretogo = driver.findElement(By.linkText("Find the URL without clicking me."));
	      
	     String togo = Wheretogo.getAttribute("href");
	     
	     System.out.println("thislinkisgoingto"+ togo);
	     
	     Thread.sleep(3000);
	     
	     //
	     WebElement Brokenlink = driver.findElement(By.linkText("Broken?"));
	     Brokenlink.click();
	    
		String Broken = driver.getTitle();
		if (Broken.contains("404")) {
			System.out.println("title is broken"+ Broken);
		}
		driver.navigate().back();
		
	
		
		List<WebElement> Numoflinks = driver.findElements(By.xpath("//div[@class='grid formgrid']"));
	     
	     int size = Numoflinks.size();
	     System.out.println("Size of the link is"+ size);
	     
		 //Homepage.click();   use for stale element exception 
	     
	      
	
	
	
	}
}
