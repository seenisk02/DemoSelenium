package com.DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Workingwithtextbox {
	public static void main(String[] args) {
	    
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver = new EdgeDriver();	      
	      driver.manage().window().maximize();
	      driver.get("https://www.leafground.com/input.xhtml ");
	      
	     WebElement entertext = driver.findElement(By.id("j_idt88:name"));
	     entertext.sendKeys("AutomationTesting");
	      
	     WebElement appendtext = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']"));
	     appendtext.sendKeys("QA");
	      
	     WebElement attributetext = driver.findElement(By.id("j_idt88:j_idt97"));
	     String Value =  attributetext.getAttribute("value");
	     System.out.println(Value);
	 
	     WebElement Clear =  driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']"));
	     Clear.clear();
	     
	     WebElement Disabled = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']"));
	     
	     Boolean Dis = Disabled.isEnabled();
	   
	     System.out.println(Dis);
	}
}
