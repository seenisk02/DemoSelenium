package com.DemoSelenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get(
				"https://www.flipkart.com/search?q=iphone15&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_8_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_2_8_na_na_na&as-pos=2&as-type=HISTORY&suggestionId=iphone15%7CMobiles&requestId=d114a2bc-c5db-4962-ab6f-d7396dc4ad7e");
		WebElement element = driver.findElement(By.xpath(
				"//div[text()='Apple iPhone 15 Plus (Yellow, 512 GB)']/parent::div/parent::div/child::div[@class='col col-5-12 BfVC2z']/child::div/child::div/child::div[@class='Nx9bqj _4b5DiR']"));
			String S =	element.getText();
System.out.println(S);
//		driver.get("https://www.leafground.com/window.xhtml");
//		//driver.get("https://toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/");
//		
////	      List<WebElement> elements = driver.findElements(By.xpath("//td[text()='Selenium']//parent::tr/descendant::*"));
////	      
////	      for (WebElement webElement : elements) {
////	    	  System.out.println(webElement.getText());
//		// }
//
//		// for(int i=0;i<elements.size();i++) {
//		// System.out.println(elements.get(i).getText());
//
//		// }
//		
//		String windowHandle = driver.getWindowHandle();
//		
//		WebElement element = driver.findElement(By.id("j_idt88:new"));
//		
//		element.click();
//		
//		Set<String> windowHandles = driver.getWindowHandles();
//		for (String string1 : windowHandles) {
//			driver.switchTo().window(windowHandle);
//			
//		}
//		

	}
}
