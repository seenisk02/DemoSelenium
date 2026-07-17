package com.DemoSelenium;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T5 { 
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://www.cleartrip.com/flights?utm_source=bing_fl_search&utm_medium=cpa&utm_content=Responsive_ad&utm_campaign=Gen:Search_Bing_DeskTab&msclkid=929eab04e0b8158b3d0fcc617f839e03");
	//driver.get("https://practice.expandtesting.com/");

driver.get("https://practice.expandtesting.com/dropdown");

Thread.sleep(3000);


WebElement element = driver.findElement(By.xpath("//select[@name='country']//option"));

Actions A = new Actions(driver);

A.moveToElement(element).perform();

element.click();

Select D = new Select(element);
List<WebElement> S5 = D.getOptions();



for(WebElement Drop : S5) {
	
	String dropdown = Drop.getText();
	
	if (dropdown.equalsIgnoreCase("Mali")) {
		Drop.click();
	}
}











//Select S = new Select(fita);
//
//S.selectByVisibleText("Option 2");

//Select S1 = new Select(S);







//
//Thread.sleep(5000);
//driver.findElement(By.id("j_idt88:new")).click();
//Thread.sleep(5000);
//String parentwindow = driver.getWindowHandle();
//
//Set<String> windowHandles = driver.getWindowHandles();
//
//
//for (String string : windowHandles) {
//	
//	if (!string.equals(parentwindow)) {
//		driver.switchTo().window(parentwindow);
//	}
//	
//	public void m1() {
//		// TODO Auto-generated method stub
//		
//	}
//}
//
//
//
//










//driver.findElement(By.id("j_idt88:new")).click();
//
//String Parentwindow =driver.getWindowHandle();
//
//Set<String>allwindow=driver.getWindowHandles();
//
//for (String newall : allwindow) {
//	if (!newall.equals(Parentwindow)) {
//		driver.switchTo().window(Parentwindow);
//	}
//	
//
//}



}
}
