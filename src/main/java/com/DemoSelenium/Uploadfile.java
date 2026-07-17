package com.DemoSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uploadfile {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
	    
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver = new EdgeDriver();	      
	      driver.manage().window().maximize();
	      driver.get("https://www.leafground.com/file.xhtml");
	      
	      WebElement upload = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]"));
	      upload.click();
	      Thread.sleep(3000);
	      String Location = "C:\\Users\\seeni\\Downloads\\TestLeaf Logo.png";
	      
	      StringSelection Loc = new StringSelection(Location);
	      
	      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Loc, null);
	      
	      
	      Robot paste = new Robot();
	      paste.keyPress(KeyEvent.VK_CONTROL);
	      paste.keyPress(KeyEvent.VK_V);
	      paste.keyRelease(KeyEvent.VK_V);
	      paste.keyRelease(KeyEvent.VK_CONTROL);
	      Thread.sleep(4000);
	      paste.keyPress(KeyEvent.VK_ENTER);
	      paste.keyRelease(KeyEvent.VK_ENTER);
	      
	      
	      
	      
	      
	      
	      
	      
	}

}
