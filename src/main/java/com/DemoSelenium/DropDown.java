package com.DemoSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
	    
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();	      
	      driver.manage().window().maximize();
	      driver.get("https://testautomationpractice.blogspot.com/");
	      
	      WebElement Drop12 = driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
//	      
	      Select drp = new Select(Drop12);
	      
	      drp.selectByIndex(2);
	      
	      Thread.sleep(3000);
	      
	      drp.selectByVisibleText("China");
	      
	      Thread.sleep(3000);
	      
	      drp.selectByValue("japan");
	      
	      List<WebElement> options = drp.getOptions();
	      
	      for(WebElement op : options) {
	    	  System.out.println(op.getText());
	    	  System.out.println(op.getSize());
	      }
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
//	      WebElement Dropdown =driver.findElement(By.xpath("//select[@id='j_idt87:country_input']"));
//	      Select Drop = new Select(Dropdown);
//	      
//	     Drop.selectByIndex(1);
//	     Thread.sleep(3000);
	    // Drop.selectByVisibleText("Playwright");
	   
//	      List<WebElement> options = Drop.getOptions();
//	      
//	      int Size =options.size();
//	      
//	      System.out.println("Size of dropdown"+ Size);
//	      Thread.sleep(3000);
//	      Dropdown.sendKeys("C");
	 //  -----------------------------------------------------------------------------------------------   
	      
//	      WebElement Multi = driver.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']"));
//          Select Multidrop = new Select(Multi);
//          
//          Multidrop.selectByIndex(1);
//          Multidrop.selectByIndex(2);
//          Multidrop.selectByIndex(3);
//          
	      
	      
//	  WebElement drop=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
//	      Select dr = new Select(drop);
//	      
//	      //dr.selectByIndex(1);
//	      dr.selectByValue("Selenium");
//	     List< WebElement > dr1 = driver.findElements(By.id("j_idt87:country"));
//	      Select select = new Select(dr1);
////	      select.selectByValue("India");
//	      
//	      for(WebElement option : select.getOptions()) {
//	    	  
//	    	  System.out.println(option.getText());
	    //  }
	      
//	      WebElement S = driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
//	Select S1 = new Select(S)	;
//	
//	S1.selectByIndex(5);
//	Thread.sleep(3000);
//	S1.selectByVisibleText("United States");
	
	
	
	}
}