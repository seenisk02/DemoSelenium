package com.DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	  WebDriver driver = new EdgeDriver();	      
    driver.manage().window().maximize();
    driver.get("https://www.leafground.com/checkbox.xhtml");
    
    
    
    WebElement Basic = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/span"));
    Basic.click();
    
    WebElement Notification = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91\"]/span"));
    Notification.click();
    Thread.sleep(3000);
    WebElement Popup = driver.findElement(By.xpath("//*[@id=\"j_idt87:msg_container\"]/div/div/div[2]/span"));
   if (Popup.isDisplayed()) {
	System.out.println("popup is displayed");
}
    
    WebElement Lang = driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[1]"));
    WebElement Lang1 = driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[2]"));
    WebElement Lang2 = driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[3]"));
    
    Lang.click();
    Lang1.click();
    Lang2.click();
    
    Thread.sleep(3000);
    
    Lang2.click();
    
    driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt100\"]/div[2]")).click();
    
   WebElement D = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102\"]/div[2]/span"));
    
   if (D.isEnabled()) {
	System.out.println("Yes");
} else {
System.out.println("No");
}
	}
}
