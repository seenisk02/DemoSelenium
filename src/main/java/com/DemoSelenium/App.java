package com.DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
  public static void main(String[] args) {
    
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver = new EdgeDriver();
	 
//          // Maximize the browser window
//          driver.manage().window().maximize();
//          // Navigate to Google
//          driver.get("https://www.google.com");
//         // String url = "https://www.google.com";
//          //driver.getCurrentUrl();
//      driver.findElement(By.name("q")).sendKeys("seeni"+Keys.ENTER);
//          // Close the driver
//         // driver.quit();
	  
	  driver.findElement(By.name(null));
	  driver.findElement(By.id(null));
	  driver.findElement(By.linkText(null));
	  driver.findElement(By.partialLinkText(null));
	  driver.findElement(By.xpath(""));
	  
	  //tagname[@attname = 'attvalue']
	  //tagname[text()='']
	  //tagname[Contains(text()='')]
	  //tagname[contains[@attname,'attvalue']
	  //(tagname[@attname = 'attvalue'])[index]
      
  }
}
