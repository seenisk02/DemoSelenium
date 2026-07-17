package com.DemoSelenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandlessssss {

	public static void main(String[] args) {
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		
		for(int i=1;i<=9;i++) {
			((EdgeDriver)driver).executeScript("window.open('https://www.leafground.com/window.xhtml', '_blank');");
		}
		
		Set<String> windowHandles = driver.getWindowHandles();
		List <String> tabs = new ArrayList<>(windowHandles);
		
		for(int i = 0;i<tabs.size();i++) {
			driver.switchTo().window(tabs.get(i));
			System.out.println("tab"+i+"Title"+driver.getTitle());
		}
		
		int tabindex = 7;
		
		if (tabs.size()>tabindex) {
			driver.switchTo().window(tabs.get(tabindex));
			System.out.println("switched to"+tabindex+": "+driver.getTitle());
		}
	}
}
