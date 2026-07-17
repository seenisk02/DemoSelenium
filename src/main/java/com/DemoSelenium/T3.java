package com.DemoSelenium;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T3 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://adactin.com/HotelApp/index.php");
	driver.manage().window().maximize();
	
	// List<WebElement> elements = driver.findElements(By.xpath("//div[text()='Gender']//parent::div[@id='u_0_c_JK']/descendant::input[@type='radio']"));
	
//for (int i = 1; i <= 3; i++) {
//	
//	WebElement element = driver.findElement(By.xpath("(//input[@id='sex']/parent::Label)["+i+"]"));
//	String text = element.getText();
//	System.out.println(text);
	WebElement element = driver.findElement(By.xpath("//td[@class='build_title']"));
	
	String cssValue1 = element.getCssValue("font-size");
	System.out.println(cssValue1);
	String cssValue2 = element.getCssValue("color");
	System.out.println(cssValue2);
	String cssValue3 = element.getCssValue("font-weight");
	System.out.println(cssValue2);
	String cssValue4 = element.getCssValue("font-family");
	System.out.println(cssValue2);
	
}
	
	
}

